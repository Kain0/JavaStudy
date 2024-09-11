package com.exampleguides.springboot_first_app.annotations.profiling;

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
