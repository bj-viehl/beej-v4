/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.beej.components.promoslice;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class promoslice__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
out.write("<section class=\"beej-promo-slice\">\n    <div");
{
    String var_attrcontent0 = ("beej-promo-slice__wrapper " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "promoWidth"), "attribute")));
    out.write(" class=\"");
    out.write(renderContext.getObjectModel().toString(var_attrcontent0));
    out.write("\"");
}
out.write(">\n        <div");
{
    String var_attrcontent1 = ("beej-promo-slice__container " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "promoArrangement"), "attribute")));
    out.write(" class=\"");
    out.write(renderContext.getObjectModel().toString(var_attrcontent1));
    out.write("\"");
}
out.write(">\n            <div");
{
    String var_attrcontent2 = ("beej-promo-slice__image " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "promoImageOverlayColor"), "attribute")));
    out.write(" class=\"");
    out.write(renderContext.getObjectModel().toString(var_attrcontent2));
    out.write("\"");
}
{
    String var_attrcontent3 = (("background-image: url('" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "promoImage"), "uri"))) + "');");
    out.write(" style=\"");
    out.write(renderContext.getObjectModel().toString(var_attrcontent3));
    out.write("\"");
}
out.write("></div>\n            <div");
{
    String var_attrcontent4 = ("beej-promo-slice__content " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "promoContentBackground"), "attribute")));
    out.write(" class=\"");
    out.write(renderContext.getObjectModel().toString(var_attrcontent4));
    out.write("\"");
}
out.write(">\n                ");
{
    Object var_testvariable5 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "promoTitle");
    if (renderContext.getObjectModel().toBoolean(var_testvariable5)) {
        out.write("<h3 class=\"beej-promo-slice__title\">");
        {
            Object var_6 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "promoTitle"), "text");
            out.write(renderContext.getObjectModel().toString(var_6));
        }
        out.write("</h3>");
    }
}
out.write("\n                ");
{
    Object var_testvariable7 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "promoText");
    if (renderContext.getObjectModel().toBoolean(var_testvariable7)) {
        out.write("<p class=\"beej-promo-slice__text\">");
        {
            Object var_8 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "promoText"), "text");
            out.write(renderContext.getObjectModel().toString(var_8));
        }
        out.write("</p>");
    }
}
out.write("\n                ");
{
    Object var_testvariable9 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "promoCTAPath");
    if (renderContext.getObjectModel().toBoolean(var_testvariable9)) {
        out.write("<div class=\"beej-button__container\">\n                    <a");
        {
            String var_attrcontent10 = ("beej-button " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "promoCTAColor"), "attribute")));
            out.write(" class=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent10));
            out.write("\"");
        }
        {
            Object var_attrvalue11 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "promoCTAPath");
            {
                Object var_attrcontent12 = renderContext.call("xss", var_attrvalue11, "uri");
                {
                    boolean var_shoulddisplayattr14 = (((null != var_attrcontent12) && (!"".equals(var_attrcontent12))) && ((!"".equals(var_attrvalue11)) && (!((Object)false).equals(var_attrvalue11))));
                    if (var_shoulddisplayattr14) {
                        out.write(" href");
                        {
                            boolean var_istrueattr13 = (var_attrvalue11.equals(true));
                            if (!var_istrueattr13) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent12));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write(">");
        {
            Object var_15 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "promoCTAText"), "text");
            out.write(renderContext.getObjectModel().toString(var_15));
        }
        out.write("</a>\n                </div>");
    }
}
out.write("\n            </div>\n        </div>\n    </div>\n</section>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

