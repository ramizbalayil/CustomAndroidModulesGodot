extends Node2D

var module = null

func _ready():
	if(Engine.has_singleton("CustomAndroidModule")):
		print("has module")
		module = Engine.get_singleton("CustomAndroidModule")


func _on_TextureButton_button_down():
	print("Button Pressed")
	if(module):
		print(module.myFirstFunction(2,3))
