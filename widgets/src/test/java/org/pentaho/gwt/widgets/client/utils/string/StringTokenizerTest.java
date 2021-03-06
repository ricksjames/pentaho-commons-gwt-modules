/*!
* This program is free software; you can redistribute it and/or modify it under the
* terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software
* Foundation.
*
* You should have received a copy of the GNU Lesser General Public License along with this
* program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
* or from the Free Software Foundation, Inc.,
* 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
*
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
* without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
* See the GNU Lesser General Public License for more details.
*
* Copyright (c) 2002-2017 Hitachi Vantara..  All rights reserved.
*/

package org.pentaho.gwt.widgets.client.utils.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringTokenizerTest {

  @Test
  public void testCountTokens() throws Exception {
    assertEquals( 6, new StringTokenizer( "shqwhsiu,erteryt,tryt,rytuty.utyu,tyuty", ",." ).countTokens() );
    assertEquals( 5, new StringTokenizer( "2e3_324_er_$5$_#3re", '_' ).countTokens() );
  }

  @Test
  public void testTokenAt() throws Exception {
    assertEquals( "try.t", new StringTokenizer( "shqwhsiu,erteryt,try.t,rytuty.utyu,tyuty", "," ).tokenAt( 2 ) );
  }
}
