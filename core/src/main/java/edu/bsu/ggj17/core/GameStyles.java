/*
 * Copyright 2017 Paul Gestwicki, Alex Hoffman, and Darby Siscoe
 *
 * This file is part of Fermata
 *
 * Fermata is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Fermata is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Fermata.  If not, see <http://www.gnu.org/licenses/>.
 */

package edu.bsu.ggj17.core;

import playn.core.Font;
import playn.core.Graphics;
import tripleplay.ui.*;

public class GameStyles {

    /**
     * Creates and returns a simple default stylesheet.
     */
    public static Stylesheet newSheet(Graphics gfx) {
        return newSheetBuilder(gfx).create();
    }

    /**
     * Creates and returns a stylesheet builder configured with some useful default styles. The
     * caller can augment the sheet with additional styles and call {@code create}.
     */
    public static Stylesheet.Builder newSheetBuilder(Graphics gfx) {
        Font regularFont = new Font("Regular", 24f);

        int bgColor = 0xFFCCCCCC, ulColor = 0xFFEEEEEE, brColor = 0xFFAAAAAA;
        Background butBg = Background.roundRect(gfx, bgColor, 5, ulColor, 2).inset(5, 6, 2, 6);
        Background butSelBg = Background.roundRect(gfx, bgColor, 5, brColor, 2).inset(6, 5, 1, 7);
        return Stylesheet.builder().
                add(Button.class,
                        Style.BACKGROUND.is(butBg),
                        Style.FONT.is(regularFont)).
                add(Button.class, Style.Mode.SELECTED,
                        Style.BACKGROUND.is(butSelBg),
                        Style.FONT.is(regularFont)).
                add(ToggleButton.class,
                        Style.BACKGROUND.is(butBg)).
                add(ToggleButton.class, Style.Mode.SELECTED,
                        Style.BACKGROUND.is(butSelBg)).
                add(CheckBox.class,
                        Style.BACKGROUND.is(Background.roundRect(gfx, bgColor, 5, ulColor, 2).
                                inset(3, 2, 0, 3))).
                add(CheckBox.class, Style.Mode.SELECTED,
                        Style.BACKGROUND.is(Background.roundRect(gfx, bgColor, 5, brColor, 2).
                                inset(3, 2, 0, 3))).
                add(Field.class,
                        Style.BACKGROUND.is(Background.beveled(0xFFFFFFFF, brColor, ulColor).inset(5)),
                        Style.HALIGN.left).
                add(Field.class, Style.Mode.DISABLED,
                        Style.BACKGROUND.is(Background.beveled(0xFFCCCCCC, brColor, ulColor).inset(5))).
                add(Label.class,
                        Style.FONT.is(regularFont)).
                add(Menu.class,
                        Style.BACKGROUND.is(Background.bordered(0xFFFFFFFF, 0x00000000, 1).inset(6))).
                add(MenuItem.class,
                        Style.BACKGROUND.is(Background.solid(0xFFFFFFFF)),
                        Style.HALIGN.left).
                add(MenuItem.class, Style.Mode.SELECTED,
                        Style.BACKGROUND.is(Background.solid(0xFF000000)),
                        Style.COLOR.is(0xFFFFFFFF)).
                add(Tabs.class,
                        Tabs.HIGHLIGHTER.is(Tabs.textColorHighlighter(0xFF000000, 0xFFFFFFFF)));
    }
}
