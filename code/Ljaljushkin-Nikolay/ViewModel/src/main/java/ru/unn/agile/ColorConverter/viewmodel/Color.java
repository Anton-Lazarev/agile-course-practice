package ru.unn.agile.ColorConverter.viewmodel;

import ru.unn.agile.ColorConverter.Model.ColorSpaces.ColorSpace3D;
import ru.unn.agile.ColorConverter.Model.ColorSpaces.Hsv;
import ru.unn.agile.ColorConverter.Model.ColorSpaces.Lab;
import ru.unn.agile.ColorConverter.Model.ColorSpaces.Rgb;

public enum Color {
    HSV(new Hsv()),
    LAB(new Lab()),
    RGB(new Rgb());

    private ColorSpace3D color;

    Color(final ColorSpace3D value) {
        color = value;
    }

    public ColorSpace3D getValue() {
        return color;
    }

    public void setColor(final ColorSpace3D value) {
        color = value;
    }
}
