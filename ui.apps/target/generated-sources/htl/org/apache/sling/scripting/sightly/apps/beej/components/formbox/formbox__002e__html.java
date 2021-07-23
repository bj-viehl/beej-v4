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
package org.apache.sling.scripting.sightly.apps.beej.components.formbox;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class formbox__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
out.write("<section");
{
    String var_attrcontent0 = ((("beej-form-box " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "formBoxBackgroundColor"), "attribute"))) + " ") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "formBoxMaxWidth"), "attribute")));
    out.write(" class=\"");
    out.write(renderContext.getObjectModel().toString(var_attrcontent0));
    out.write("\"");
}
{
    String var_attrcontent1 = (("background-image: url('" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "formBoxBackgroundImage"), "uri"))) + "');");
    out.write(" style=\"");
    out.write(renderContext.getObjectModel().toString(var_attrcontent1));
    out.write("\"");
}
out.write(">\n    <form");
{
    String var_attrcontent2 = ("beej-form-box__form margins " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "formTheme"), "attribute")));
    out.write(" class=\"");
    out.write(renderContext.getObjectModel().toString(var_attrcontent2));
    out.write("\"");
}
out.write(">\n        <h4 class=\"beej-form-box__form-title\">");
{
    Object var_3 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "formBoxTitle"), "text");
    out.write(renderContext.getObjectModel().toString(var_3));
}
out.write("</h4>\n        <p class=\"beej-form-box__form-text\">");
{
    Object var_4 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "formBoxText"), "text");
    out.write(renderContext.getObjectModel().toString(var_4));
}
out.write("</p>\n        <div class=\"beej-form-box__form-container\">\n");
{
    String var_5 = (("<!--            <sly data-sly-resource=\"" + renderContext.getObjectModel().toString(renderContext.call("xss", "formbox", "comment"))) + "\" data-sly-unwrap></sly>-->");
    out.write(renderContext.getObjectModel().toString(var_5));
}
out.write("\n            <div class=\"beej-input-group\">\n                <label for=\"firstname\">First Name:</label>\n                <input type=\"text\" name=\"firstname\" id=\"firstname\"/>\n            </div>\n            <div class=\"beej-input-group\">\n                <label for=\"lastname\">Last Name:</label>\n                <input type=\"text\" name=\"firstname\" id=\"lastname\"/>\n            </div>\n            <div class=\"beej-input-group\">\n                <label for=\"occupation\">Occupation</label>\n                <input type=\"text\" name=\"occupation\" id=\"occupation\"/>\n            </div>\n            <div class=\"beej-input-group\">\n                <label for=\"email\">Email:</label>\n                <input type=\"email\" name=\"email\" id=\"email\"/>\n            </div>\n            <div class=\"beej-input-group\">\n                <label for=\"comment\">Comments:</label>\n                <textarea name=\"comment\" id=\"comment\"></textarea>\n            </div>\n            <div class=\"beej-form-button beej-button__container\">\n                <a");
{
    Object var_attrvalue6 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "formButtonPath");
    {
        Object var_attrcontent7 = renderContext.call("xss", var_attrvalue6, "uri");
        {
            boolean var_shoulddisplayattr9 = (((null != var_attrcontent7) && (!"".equals(var_attrcontent7))) && ((!"".equals(var_attrvalue6)) && (!((Object)false).equals(var_attrvalue6))));
            if (var_shoulddisplayattr9) {
                out.write(" href");
                {
                    boolean var_istrueattr8 = (var_attrvalue6.equals(true));
                    if (!var_istrueattr8) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent7));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
{
    String var_attrcontent10 = ("beej-button " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "formButtonColor"), "attribute")));
    out.write(" class=\"");
    out.write(renderContext.getObjectModel().toString(var_attrcontent10));
    out.write("\"");
}
out.write(">");
{
    Object var_11 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "formButtonText"), "text");
    out.write(renderContext.getObjectModel().toString(var_11));
}
out.write("</a>\n            </div>\n        </div>\n    </form>\n</section>\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

