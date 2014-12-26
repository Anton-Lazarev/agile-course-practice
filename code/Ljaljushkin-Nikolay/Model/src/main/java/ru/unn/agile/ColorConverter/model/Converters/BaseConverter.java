package ru.unn.agile.ColorConverter.Model.Converters;

import ru.unn.agile.ColorConverter.Model.ColorSpaces.ColorSpace3D;
import ru.unn.agile.ColorConverter.Model.ColorSpaces.Rgb;

public abstract class BaseConverter {
    public abstract void fromRgb(final Rgb srcColor, final ColorSpace3D dstColor);

    public abstract Rgb toRgbColor(final ColorSpace3D srcColor);
}
