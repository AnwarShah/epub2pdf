/*
epub2pdf, version 0.5 - Copyright 2010 Brendan C. LeFebvre

This file is part of epub2pdf.

epub2pdf is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

epub2pdf is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with epub2pdf.  If not, see <http://www.gnu.org/licenses/>.
*/
package com.amphisoft.pdf;

public enum ITFontStyle {
    UNDEFINED(-1),
    NORMAL(0),
    BOLD(1),
    ITALIC(2),
    UNDERLINE(4),
    STRIKETHRU(8),
    BOLDITALIC(BOLD.value | ITALIC.value);

    public final int value;

    ITFontStyle(int i) {
        value = i;
    }
}
