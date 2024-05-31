package com.noobexon.asleech

import android.accessibilityservice.AccessibilityService
import android.util.Log
import android.view.accessibility.AccessibilityEvent
import android.view.accessibility.AccessibilityNodeInfo

class ASLeech : AccessibilityService() {
    private val tag = "ASLeech"

    private lateinit var eventHandler: EventHandler

    override fun onServiceConnected() {
        super.onServiceConnected()
        eventHandler = EventHandler()
    }

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        event?.let {
            if (it.eventType == AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED) {
                val rootNode: AccessibilityNodeInfo? = rootInActiveWindow
                rootNode?.let { root ->
                    logViewHierarchy(root, 0)
                    findAndPerformAction(root)
                }
            }
        }
    }

    override fun onInterrupt() {
        Log.d(tag, "Service interrupted")
    }

    private fun findAndPerformAction(nodeInfo: AccessibilityNodeInfo): Boolean {
        if (nodeInfo.packageName == "com.android.settings" &&
            nodeInfo.className == "android.widget.TextView" &&
            nodeInfo.text == "ASLeech") {

            performGlobalAction(GLOBAL_ACTION_BACK)
            return true
        }

        for (i in 0 until nodeInfo.childCount) {
            val child = nodeInfo.getChild(i)
            if (child != null && findAndPerformAction(child)) {
                return true
            }
        }
        return false
    }

    private fun logViewHierarchy(nodeInfo: AccessibilityNodeInfo, depth: Int) {
        val prefix = "  ".repeat(depth)
        val description = buildString {
            append(prefix)
            append(nodeInfo.toString())
        }

        Log.d(tag, description)

        for (i in 0 until nodeInfo.childCount) {
            val child = nodeInfo.getChild(i)
            child?.let {
                logViewHierarchy(it, depth + 1)
            }
        }
    }
}
