package com.noobexon.asleech

import android.util.Log
import android.view.accessibility.AccessibilityEvent

class EventHandler {
    private val tag = "EventHandler"

    fun handleEvent(event: AccessibilityEvent) {
        when (event.eventType) {
            AccessibilityEvent.TYPE_VIEW_TEXT_CHANGED -> handleTextChanged(event)
            AccessibilityEvent.TYPE_VIEW_TEXT_SELECTION_CHANGED -> handleTextSelectionChanged(event)
            AccessibilityEvent.TYPE_ANNOUNCEMENT -> handleAnnouncement(event)
            AccessibilityEvent.TYPE_ASSIST_READING_CONTEXT -> handleAssistReadingContext(event)
            AccessibilityEvent.TYPE_GESTURE_DETECTION_END -> handleGestureDetectionEnd(event)
            AccessibilityEvent.TYPE_GESTURE_DETECTION_START -> handleGestureDetectionStart(event)
            AccessibilityEvent.TYPE_NOTIFICATION_STATE_CHANGED -> handleNotificationStateChanged(event)
            AccessibilityEvent.TYPE_SPEECH_STATE_CHANGE -> handleSpeechStateChange(event)
            AccessibilityEvent.TYPE_TOUCH_EXPLORATION_GESTURE_END -> handleTouchExplorationGestureEnd(event)
            AccessibilityEvent.TYPE_TOUCH_EXPLORATION_GESTURE_START -> handleTouchExplorationGestureStart(event)
            AccessibilityEvent.TYPE_TOUCH_INTERACTION_END -> handleTouchInteractionEnd(event)
            AccessibilityEvent.TYPE_TOUCH_INTERACTION_START -> handleTouchInteractionStart(event)
            AccessibilityEvent.TYPE_VIEW_ACCESSIBILITY_FOCUSED -> handleViewAccessibilityFocused(event)
            AccessibilityEvent.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED -> handleViewAccessibilityFocusCleared(event)
            AccessibilityEvent.TYPE_VIEW_CLICKED -> handleViewClicked(event)
            AccessibilityEvent.TYPE_VIEW_CONTEXT_CLICKED -> handleViewContextClicked(event)
            AccessibilityEvent.TYPE_VIEW_FOCUSED -> handleViewFocused(event)
            AccessibilityEvent.TYPE_VIEW_HOVER_ENTER -> handleViewHoverEnter(event)
            AccessibilityEvent.TYPE_VIEW_HOVER_EXIT -> handleViewHoverExit(event)
            AccessibilityEvent.TYPE_VIEW_LONG_CLICKED -> handleViewLongClicked(event)
            AccessibilityEvent.TYPE_VIEW_SCROLLED -> handleViewScrolled(event)
            AccessibilityEvent.TYPE_VIEW_SELECTED -> handleViewSelected(event)
            AccessibilityEvent.TYPE_VIEW_TARGETED_BY_SCROLL -> handleViewTargetedByScroll(event)
            AccessibilityEvent.TYPE_VIEW_TEXT_TRAVERSED_AT_MOVEMENT_GRANULARITY -> handleViewTextTraversedAtMovementGranularity(event)
            AccessibilityEvent.TYPE_WINDOWS_CHANGED -> handleWindowsChanged(event)
            AccessibilityEvent.TYPE_WINDOW_CONTENT_CHANGED -> handleWindowContentChanged(event)
            AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED -> handleWindowStateChanged(event)
            else -> handleOther(event)
        }
    }

    private fun handleTextChanged(event: AccessibilityEvent) {
        val text = event.text.joinToString(separator = " ")
        Log.d(tag, "Text Changed: $text - [${event.packageName}]")
    }

    private fun handleTextSelectionChanged(event: AccessibilityEvent) {
        val text = event.text.joinToString(separator = " ")
        val fromIndex = event.fromIndex
        val toIndex = event.toIndex
        Log.d(tag, "Text Selection Changed: $text - [${event.packageName}, fromIndex: $fromIndex, toIndex: $toIndex]")
    }

    private fun handleAnnouncement(event: AccessibilityEvent) {
        Log.d(tag, "Announcement: ${event.text.joinToString(separator = " ")} - [${event.packageName}]")
    }

    private fun handleAssistReadingContext(event: AccessibilityEvent) {
        Log.d(tag, "Assist Reading Context: ${event.text.joinToString(separator = " ")} - [${event.packageName}]")
    }

    private fun handleGestureDetectionEnd(event: AccessibilityEvent) {
        Log.d(tag, "Gesture Detection End - [${event.packageName}]")
    }

    private fun handleGestureDetectionStart(event: AccessibilityEvent) {
        Log.d(tag, "Gesture Detection Start - [${event.packageName}]")
    }

    private fun handleNotificationStateChanged(event: AccessibilityEvent) {
        Log.d(tag, "Notification State Changed - [${event.packageName}]")
    }

    private fun handleSpeechStateChange(event: AccessibilityEvent) {
        Log.d(tag, "Speech State Change - [${event.packageName}]")
    }

    private fun handleTouchExplorationGestureEnd(event: AccessibilityEvent) {
        Log.d(tag, "Touch Exploration Gesture End - [${event.packageName}]")
    }

    private fun handleTouchExplorationGestureStart(event: AccessibilityEvent) {
        Log.d(tag, "Touch Exploration Gesture Start - [${event.packageName}]")
    }

    private fun handleTouchInteractionEnd(event: AccessibilityEvent) {
        Log.d(tag, "Touch Interaction End - [${event.packageName}]")
    }

    private fun handleTouchInteractionStart(event: AccessibilityEvent) {
        Log.d(tag, "Touch Interaction Start - [${event.packageName}]")
    }

    private fun handleViewAccessibilityFocused(event: AccessibilityEvent) {
        Log.d(tag, "View Accessibility Focused - [${event.packageName}]")
    }

    private fun handleViewAccessibilityFocusCleared(event: AccessibilityEvent) {
        Log.d(tag, "View Accessibility Focus Cleared - [${event.packageName}]")
    }

    private fun handleViewClicked(event: AccessibilityEvent) {
        Log.d(tag, "View Clicked - [${event.packageName}]")
    }

    private fun handleViewContextClicked(event: AccessibilityEvent) {
        Log.d(tag, "View Context Clicked - [${event.packageName}]")
    }

    private fun handleViewFocused(event: AccessibilityEvent) {
        Log.d(tag, "View Focused - [${event.packageName}]")
    }

    private fun handleViewHoverEnter(event: AccessibilityEvent) {
        Log.d(tag, "View Hover Enter - [${event.packageName}]")
    }

    private fun handleViewHoverExit(event: AccessibilityEvent) {
        Log.d(tag, "View Hover Exit - [${event.packageName}]")
    }

    private fun handleViewLongClicked(event: AccessibilityEvent) {
        Log.d(tag, "View Long Clicked - [${event.packageName}]")
    }

    private fun handleViewScrolled(event: AccessibilityEvent) {
        Log.d(tag, "View Scrolled - [${event.packageName}]")
    }

    private fun handleViewSelected(event: AccessibilityEvent) {
        Log.d(tag, "View Selected - [${event.packageName}]")
    }

    private fun handleViewTargetedByScroll(event: AccessibilityEvent) {
        Log.d(tag, "View Targeted By Scroll - [${event.packageName}]")
    }

    private fun handleViewTextTraversedAtMovementGranularity(event: AccessibilityEvent) {
        Log.d(tag, "View Text Traversed At Movement Granularity - [${event.packageName}]")
    }

    private fun handleWindowsChanged(event: AccessibilityEvent) {
        Log.d(tag, "Windows Changed - [${event.packageName}]")
    }

    private fun handleWindowContentChanged(event: AccessibilityEvent) {
        Log.d(tag, "Window Content Changed - [${event.packageName}]")
    }

    private fun handleWindowStateChanged(event: AccessibilityEvent) {
        Log.d(tag, "Window State Changed - [${event.packageName}]")
    }

    private fun handleOther(event: AccessibilityEvent) {
        Log.d(tag, "Other Event - [${event.packageName}]")
    }
}
