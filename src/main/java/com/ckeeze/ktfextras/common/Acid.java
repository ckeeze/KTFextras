package com.ckeeze.ktfextras.common;

import java.util.Locale;

public enum Acid {

    NITRIC_ACID(-4728388),
    SULFURIC_ACID(-3694808),
    HYDROCHLORIC_ACID(-2302756),
    AQUA_REGIA(-3703471);

    private final String id;
    private final int color;

    Acid(int color)
    {
        this.id = this.name().toLowerCase(Locale.ROOT);
        this.color = color;
    }

    public String getId()
    {
        return this.id;
    }

    public int getColor()
    {
        return this.color;
    }
}

