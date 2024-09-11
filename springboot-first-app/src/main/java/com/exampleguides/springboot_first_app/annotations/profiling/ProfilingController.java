package com.exampleguides.springboot_first_app.annotations;

public class ProfilingController implements ProfilingControllerMBean {
    private boolean enabled = false;

    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
