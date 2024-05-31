package com.noobexon.asleech

import android.accessibilityservice.AccessibilityService
import android.view.accessibility.AccessibilityEvent

class ASLeech : AccessibilityService() {

    private lateinit var eventHandler: EventHandler

    override fun onServiceConnected() {
        super.onServiceConnected()
        eventHandler = EventHandler()
    }

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        event?.let {
            eventHandler.handleEvent(event)
        }
    }

    override fun onInterrupt() {
        // Handle service interruption
    }
}
