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
package org.apache.sling.scripting.sightly.apps.beej.components.hero;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class hero__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
out.write("<section");
{
    String var_attrcontent0 = ((("beej-hero " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "heroBackgroundColor"), "attribute"))) + " ") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "heroMaxWidth"), "attribute")));
    out.write(" class=\"");
    out.write(renderContext.getObjectModel().toString(var_attrcontent0));
    out.write("\"");
}
{
    String var_attrcontent1 = (("background-image: url('" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "heroBackgroundImage"), "uri"))) + "');");
    out.write(" style=\"");
    out.write(renderContext.getObjectModel().toString(var_attrcontent1));
    out.write("\"");
}
out.write(">\n    <div");
{
    String var_attrcontent2 = (("beej-hero__container " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "contentAlignment"), "attribute"))) + " margins");
    out.write(" class=\"");
    out.write(renderContext.getObjectModel().toString(var_attrcontent2));
    out.write("\"");
}
out.write(">\n        <div");
{
    String var_attrcontent3 = ("beej-hero__content " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "contentBackground"), "attribute")));
    out.write(" class=\"");
    out.write(renderContext.getObjectModel().toString(var_attrcontent3));
    out.write("\"");
}
out.write(">\n            <h1 class=\"beej-hero__title\">");
{
    Object var_4 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "heroTitle"), "text");
    out.write(renderContext.getObjectModel().toString(var_4));
}
out.write("</h1>\n            ");
{
    Object var_testvariable5 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "heroText");
    if (renderContext.getObjectModel().toBoolean(var_testvariable5)) {
        out.write("<p class=\"beej-hero__text\">");
        {
            Object var_6 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "heroText"), "text");
            out.write(renderContext.getObjectModel().toString(var_6));
        }
        out.write("</p>");
    }
}
out.write("\n            ");
{
    Object var_testvariable7 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "heroCTAPath");
    if (renderContext.getObjectModel().toBoolean(var_testvariable7)) {
        out.write("<div class=\"beej-button__container \">\n                <a");
        {
            String var_attrcontent8 = ("beej-button " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "heroCTAColor"), "attribute")));
            out.write(" class=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent8));
            out.write("\"");
        }
        {
            Object var_attrvalue9 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "heroCTAPath");
            {
                Object var_attrcontent10 = renderContext.call("xss", var_attrvalue9, "uri");
                {
                    boolean var_shoulddisplayattr12 = (((null != var_attrcontent10) && (!"".equals(var_attrcontent10))) && ((!"".equals(var_attrvalue9)) && (!((Object)false).equals(var_attrvalue9))));
                    if (var_shoulddisplayattr12) {
                        out.write(" href");
                        {
                            boolean var_istrueattr11 = (var_attrvalue9.equals(true));
                            if (!var_istrueattr11) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent10));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write(">");
        {
            Object var_13 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "heroCTAText"), "text");
            out.write(renderContext.getObjectModel().toString(var_13));
        }
        out.write("</a>\n            </div>");
    }
}
out.write("\n        </div>\n    </div>\n</section>\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

