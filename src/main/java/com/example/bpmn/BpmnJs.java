package com.example.bpmn;

import com.vaadin.annotations.JavaScript;
import com.vaadin.annotations.StyleSheet;
import com.vaadin.ui.AbstractJavaScriptComponent;

@JavaScript({"vaadin://jslibs/bpmn-modeler.development.js",
		"vaadin://jslibs/bpmjs-connector.js","vaadin://jslibs/jquery.js"})
@StyleSheet({"vaadin://jslibs/bpmn.css",
		"vaadin://jslibs/diagram-js.css"})
public class BpmnJs extends AbstractJavaScriptComponent {
	
	public void getDiagram() {
        callFunction("getDiagram");
    }
	
	@Override
	public BpmnJsState getState() {
		return (BpmnJsState) super.getState();
	}
}
