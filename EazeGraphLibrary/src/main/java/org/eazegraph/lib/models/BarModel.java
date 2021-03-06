/**
 *
 *   Copyright (C) 2014 Paul Cech
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package org.eazegraph.lib.models;

import android.graphics.RectF;

public class BarModel extends BaseModel {

    public BarModel(String _legendLabel, float _value, int _color) {
        super(_legendLabel);
        mValue = _value;
        mColor = _color;
    }

    public BarModel(float _value, int _color) {
        super(""+_value);
        mValue = _value;
        mColor = _color;
    }

    public BarModel(float _value) {
        super(""+_value);
        mValue = _value;
        mColor = 0xFFFF0000;
    }

    public float getValue() {
        return mValue;
    }

    public void setValue(float _value) {
        mValue = _value;
    }

    public int getColor() {
        return mColor;
    }

    public void setColor(int _color) {
        mColor = _color;
    }

    public RectF getBarBounds() {
        return mBarBounds;
    }

    public void setBarBounds(RectF _bounds) {
        mBarBounds = _bounds;
    }

    private float mValue;
    private int   mColor;
    private RectF mBarBounds;

}
