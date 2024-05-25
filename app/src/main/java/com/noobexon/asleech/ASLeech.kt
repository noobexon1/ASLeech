package com.noobexon.asleech

import android.accessibilityservice.AccessibilityService
import android.view.accessibility.AccessibilityEvent

class ASLeech : AccessibilityService() {

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        // Handle accessibility events
    }

    override fun onInterrupt() {
        // Handle service interruption
    }

}