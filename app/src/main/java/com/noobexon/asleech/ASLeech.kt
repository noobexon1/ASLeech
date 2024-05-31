package com.noobexon.asleech

import android.accessibilityservice.AccessibilityService
import android.util.Log
import android.view.accessibility.AccessibilityEvent
import android.view.accessibility.AccessibilityNodeInfo

class ASLeech : AccessibilityService() {

    private lateinit var eventHandler: EventHandler

    override fun onServiceConnected() {
        super.onServiceConnected()
        eventHandler = EventHandler()
    }

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        event?.let {
            // Example: Log the view hierarchy when the window state changes
            if (event.eventType == AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED) {
                val rootNode: AccessibilityNodeInfo? = rootInActiveWindow
                rootNode?.let {
                    logViewHierarchy(it, 0)
                }
            }
        }
    }

    override fun onInterrupt() {
        // Handle service interruption
    }

    private fun logViewHierarchy(nodeInfo: AccessibilityNodeInfo, depth: Int) {
        val prefix = "  ".repeat(depth)
        val description = buildString {
            append(prefix)
            append("Class: ${nodeInfo.className}, ")
            append("Text: ${nodeInfo.text}, ")
            append("ContentDescription: ${nodeInfo.contentDescription}, ")
            append("ViewId: ${nodeInfo.viewIdResourceName}")
        }
        Log.d("ASLeech", description)

        for (i in 0 until nodeInfo.childCount) {
            val child = nodeInfo.getChild(i)
            if (child != null) {
                logViewHierarchy(child, depth + 1)
            }
        }
    }
}
