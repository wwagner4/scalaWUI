package fr.iscpif.client


import TagLibrary._
import fr.iscpif.scaladget.api.BootstrapTags._
import scala.scalajs.js.annotation.JSExport
import scalatags.JsDom.tags

/*
 * Copyright (C) 24/03/16 // mathieu.leclaire@openmole.org
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

object BootstrapDemo {

  def build = tags.div(
    hiddenInput("#", "myInput", ()=> println("Yo men")),
    buttonGroupExclusive("sortingBar", btn_default)(
    ExclusiveButton.twoGlyphStates(
      glyph_triangle_bottom + " left3",
      glyph_triangle_top,
      () ⇒ println("state 1"),
      () ⇒ println("state 2"),
      "Aa",
      key("twoGlyphButton")
    ),
    ExclusiveButton.twoGlyphStates(
      glyph_triangle_bottom + " left3",
      glyph_triangle_top,
      () ⇒ println("state 1"),
      () ⇒ println("state 2"),
      preGlyph = key("twoGlyphButton") + glyph_time
    ),
    ExclusiveButton.twoGlyphStates(
      glyph_triangle_bottom + " left3",
      glyph_triangle_top,
      () ⇒ println("state 1"),
      () ⇒ println("state 2"),
      preString = "Ko",
      key("twoGlyphButton")
    )
  ).div
  )


}
