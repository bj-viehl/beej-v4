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
package org.apache.sling.scripting.sightly.apps.beej.components.header;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class header__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
out.write("<header");
{
    String var_attrcontent0 = ("beej-header " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "headerColor"), "attribute")));
    out.write(" class=\"");
    out.write(renderContext.getObjectModel().toString(var_attrcontent0));
    out.write("\"");
}
{
    Object var_attrvalue1 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "stickyHeader");
    {
        Object var_attrcontent2 = renderContext.call("xss", var_attrvalue1, "attribute");
        {
            boolean var_shoulddisplayattr4 = (((null != var_attrcontent2) && (!"".equals(var_attrcontent2))) && ((!"".equals(var_attrvalue1)) && (!((Object)false).equals(var_attrvalue1))));
            if (var_shoulddisplayattr4) {
                out.write(" data-sticky");
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
out.write(" data-mod=\"header\">\n    <div class=\"beej-header__container margins\">\n        <a");
{
    Object var_attrvalue5 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "logoUrl");
    {
        Object var_attrcontent6 = renderContext.call("xss", var_attrvalue5, "uri");
        {
            boolean var_shoulddisplayattr8 = (((null != var_attrcontent6) && (!"".equals(var_attrcontent6))) && ((!"".equals(var_attrvalue5)) && (!((Object)false).equals(var_attrvalue5))));
            if (var_shoulddisplayattr8) {
                out.write(" href");
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
out.write(" class=\"beej-header__logo\">\n            <img class=\"beej-header__logo-img\"");
{
    Object var_attrvalue9 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "headerLogo");
    {
        Object var_attrcontent10 = renderContext.call("xss", var_attrvalue9, "uri");
        {
            boolean var_shoulddisplayattr12 = (((null != var_attrcontent10) && (!"".equals(var_attrcontent10))) && ((!"".equals(var_attrvalue9)) && (!((Object)false).equals(var_attrvalue9))));
            if (var_shoulddisplayattr12) {
                out.write(" src");
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
out.write("/>\n        </a>\n        <div class=\"beej-header__menu\">\n            <div class=\"beej-header__menu-container\">\n                ");
{
    Object var_resourcecontent14 = renderContext.call("includeResource", "parsys", obj().with("resourceType", "foundation/components/parsys"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent14));
}
out.write("\n                ");
{
    Object var_testvariable15 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "headerCTAPath");
    if (renderContext.getObjectModel().toBoolean(var_testvariable15)) {
        out.write("<div class=\"beej-header__cta-button beej-button__container\">\n                    <a");
        {
            String var_attrcontent16 = ("beej-button " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "headerCTAColor"), "attribute")));
            out.write(" class=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent16));
            out.write("\"");
        }
        {
            Object var_attrvalue17 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "headerCTAPath");
            {
                Object var_attrcontent18 = renderContext.call("xss", var_attrvalue17, "uri");
                {
                    boolean var_shoulddisplayattr20 = (((null != var_attrcontent18) && (!"".equals(var_attrcontent18))) && ((!"".equals(var_attrvalue17)) && (!((Object)false).equals(var_attrvalue17))));
                    if (var_shoulddisplayattr20) {
                        out.write(" href");
                        {
                            boolean var_istrueattr19 = (var_attrvalue17.equals(true));
                            if (!var_istrueattr19) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent18));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write(">");
        {
            Object var_21 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "headerCTAText"), "text");
            out.write(renderContext.getObjectModel().toString(var_21));
        }
        out.write("</a>\n                </div>");
    }
}
out.write("\n            </div>\n        </div>\n        <button class=\"beej-header__menu-button\">\n            <img class=\"beej-header__menu-button-icon beej-header__menu-button-icon--menu\"");
{
    Object var_attrvalue22 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "menuIcon");
    {
        Object var_attrcontent23 = renderContext.call("xss", var_attrvalue22, "uri");
        {
            boolean var_shoulddisplayattr25 = (((null != var_attrcontent23) && (!"".equals(var_attrcontent23))) && ((!"".equals(var_attrvalue22)) && (!((Object)false).equals(var_attrvalue22))));
            if (var_shoulddisplayattr25) {
                out.write(" src");
                {
                    boolean var_istrueattr24 = (var_attrvalue22.equals(true));
                    if (!var_istrueattr24) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent23));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write("/>\n            <img class=\"beej-header__menu-button-icon beej-header__menu-button-icon--closed\"");
{
    Object var_attrvalue26 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "closeIcon");
    {
        Object var_attrcontent27 = renderContext.call("xss", var_attrvalue26, "uri");
        {
            boolean var_shoulddisplayattr29 = (((null != var_attrcontent27) && (!"".equals(var_attrcontent27))) && ((!"".equals(var_attrvalue26)) && (!((Object)false).equals(var_attrvalue26))));
            if (var_shoulddisplayattr29) {
                out.write(" src");
                {
                    boolean var_istrueattr28 = (var_attrvalue26.equals(true));
                    if (!var_istrueattr28) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent27));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write("/>\n        </button>\n    </div>\n</header>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

