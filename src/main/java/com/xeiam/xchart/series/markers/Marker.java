/**
 * Copyright 2011 Xeiam LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.xeiam.xchart.series.markers;

import java.awt.BasicStroke;
import java.awt.Graphics2D;

/**
 * @author timmolter
 */
public abstract class Marker {

  protected BasicStroke stroke = new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

  public static final int SIZE = 7; // make this an odd number!

  public static final int X_OFFSET = (int) (-1.0 * (SIZE / 2.0));
  public static final int Y_OFFSET = (int) (-1.0 * (SIZE / 2.0));

  public abstract void paint(Graphics2D g, int xOffset, int yOffset);
}