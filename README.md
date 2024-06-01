# DO NOT ATTEMPT INSTALLING THIS ON A REAL DEVICE UNLESS YOU ARE 100% CERTAIN THAT YOU KNOW HOW TOO REMOVE THIS! DOING SO IS A 100% ON YOU!

## Demo

![Demo](docs/example.mp4)

This is a 40 lines of code PoC for an accessibility service malware base which can not be removed easily by GUI.
I would want to say it is completely unremovable by GUI, but i havn't confirmed it 100%.

## How does it work?

* Once ASLeech is activated, it will constantly check the view for each window state change.
* If it finds out any text that corresponds to the malware, it will click on behalf of the user on the "Go back" button.
* If it finds out any text that corresponds to factory reset, it will do the same.

While not stealthy, this creates an annoying malware base that can only be removed via ADB or other techniques which are not usually known to the average user.

## How can this malware base be improved?

* Using the same technique, you can add a check to prevent the user from getting developer options (Which will prevent normal ADB usage).
* You can make it stealthy by creating an app to go with the service. Then, when the user attempts too view the accessibility services, the acommpanied app will be shown instead with a fake AS menu that does nothing on toggle.



