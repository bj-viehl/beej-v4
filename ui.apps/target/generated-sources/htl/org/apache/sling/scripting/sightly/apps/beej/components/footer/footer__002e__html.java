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
package org.apache.sling.scripting.sightly.apps.beej.components.footer;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class footer__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
Object _dynamic_multifieldhelper = bindings.get("multifieldhelper");
Object _dynamic_item = bindings.get("item");
out.write("<footer");
{
    String var_attrcontent0 = ("beej-footer " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "footerTheme"), "attribute")));
    out.write(" class=\"");
    out.write(renderContext.getObjectModel().toString(var_attrcontent0));
    out.write("\"");
}
out.write(">\n    <div class=\"beej-footer__container margins\">\n        <a class=\"beej-footer__logo\"");
{
    Object var_attrvalue1 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "logoURL");
    {
        Object var_attrcontent2 = renderContext.call("xss", var_attrvalue1, "uri");
        {
            boolean var_shoulddisplayattr4 = (((null != var_attrcontent2) && (!"".equals(var_attrcontent2))) && ((!"".equals(var_attrvalue1)) && (!((Object)false).equals(var_attrvalue1))));
            if (var_shoulddisplayattr4) {
                out.write(" href");
                {
                    boolean var_istrueattr3 = (var_attrvalue1.equals(true));
                    if (!var_istrueattr3) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent2));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(">\n            <img class=\"beej-footer__logo-img\"");
{
    Object var_attrvalue5 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "footerLogo");
    {
        Object var_attrcontent6 = renderContext.call("xss", var_attrvalue5, "uri");
        {
            boolean var_shoulddisplayattr8 = (((null != var_attrcontent6) && (!"".equals(var_attrcontent6))) && ((!"".equals(var_attrvalue5)) && (!((Object)false).equals(var_attrvalue5))));
            if (var_shoulddisplayattr8) {
                out.write(" src");
                {
                    boolean var_istrueattr7 = (var_attrvalue5.equals(true));
                    if (!var_istrueattr7) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent6));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write("/>\n        </a>\n");
{
    String var_9 = (("<!--        <nav class=\"beej-footer__nav\" data-sly-use.multiFieldHelper=\"" + renderContext.getObjectModel().toString(renderContext.call("xss", "com/adobe/aem/demo/beej/core/models/MultifieldHelper", "comment"))) + "\">-->");
    out.write(renderContext.getObjectModel().toString(var_9));
}
out.write("\n");
{
    String var_10 = (("<!--            <sly data-sly-list.item=\"" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_multifieldhelper, "itemsList"), "comment"))) + "\">-->");
    out.write(renderContext.getObjectModel().toString(var_10));
}
out.write("\n");
{
    String var_11 = (((((("<!--                <a class=\"beej-footer__nav-item\" href=\"" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_item, "navLinkURL"), "comment"))) + "\" target=\"") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_item, "navLinkTarget"), "comment"))) + "\">") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_item, "navLinkText"), "comment"))) + "</a>-->");
    out.write(renderContext.getObjectModel().toString(var_11));
}
out.write("\n<!--            </sly>-->\n<!--        </nav>-->\n        <nav class=\"beej-footer__nav\">\n            <a class=\"beej-footer__nav-item\" href=\"*\">Home</a>\n            <a class=\"beej-footer__nav-item\" href=\"*\">About</a>\n            <a class=\"beej-footer__nav-item\" href=\"*\">Products</a>\n            <a class=\"beej-footer__nav-item\" href=\"*\">Blog</a>\n            <a class=\"beej-footer__nav-item\" href=\"*\">Portfolio</a>\n        </nav>\n        <div class=\"beej-footer__legal-text\">");
{
    Object var_12 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "legalText"), "text");
    out.write(renderContext.getObjectModel().toString(var_12));
}
out.write("</div>\n    </div>\n</footer>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

