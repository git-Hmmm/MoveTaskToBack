package com.hmmm.handleback;

import android.app.Activity;
import android.content.Context;
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.EventDispatcher;

@DesignerComponent(
        version = 1,
        description = "Moves the task to the background.",
        category = ComponentCategory.EXTENSION,
        nonVisible = true)

@SimpleObject(external = true)

public class MoveTaskToBack extends AndroidNonvisibleComponent {

    private Context context;
    private Activity activity;

    public MoveTaskToBack(ComponentContainer container){
        super(container.$form());
        this.activity = container.$context();
        this.context = container.$context();
    }

    @SimpleFunction(description = "Moves the task to the background.")
    public void MoveTaskToBack() {
        activity.moveTaskToBack(true);
    }
}
