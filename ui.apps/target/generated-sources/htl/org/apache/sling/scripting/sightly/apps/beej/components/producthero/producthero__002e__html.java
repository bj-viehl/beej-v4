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
package org.apache.sling.scripting.sightly.apps.beej.components.producthero;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class producthero__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
out.write("<section class=\"beej-product-hero\">\n    \n    <productcmp");
{
    Object var_attrvalue0 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "title");
    {
        Object var_attrcontent1 = renderContext.call("xss", var_attrvalue0, "attribute");
        {
            boolean var_shoulddisplayattr3 = (((null != var_attrcontent1) && (!"".equals(var_attrcontent1))) && ((!"".equals(var_attrvalue0)) && (!((Object)false).equals(var_attrvalue0))));
            if (var_shoulddisplayattr3) {
                out.write(" title");
                {
                    boolean var_istrueattr2 = (var_attrvalue0.equals(true));
                    if (!var_istrueattr2) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent1));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
{
    Object var_attrvalue4 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "description");
    {
        Object var_attrcontent5 = renderContext.call("xss", var_attrvalue4, "attribute");
        {
            boolean var_shoulddisplayattr7 = (((null != var_attrcontent5) && (!"".equals(var_attrcontent5))) && ((!"".equals(var_attrvalue4)) && (!((Object)false).equals(var_attrvalue4))));
            if (var_shoulddisplayattr7) {
                out.write(" description");
                {
                    boolean var_istrueattr6 = (var_attrvalue4.equals(true));
                    if (!var_istrueattr6) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent5));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
{
    Object var_attrvalue8 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "productColor");
    {
        Object var_attrcontent9 = renderContext.call("xss", var_attrvalue8, "attribute");
        {
            boolean var_shoulddisplayattr11 = (((null != var_attrcontent9) && (!"".equals(var_attrcontent9))) && ((!"".equals(var_attrvalue8)) && (!((Object)false).equals(var_attrvalue8))));
            if (var_shoulddisplayattr11) {
                out.write(" buttonColor");
                {
                    boolean var_istrueattr10 = (var_attrvalue8.equals(true));
                    if (!var_istrueattr10) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent9));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
{
    Object var_attrvalue12 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "productButton");
    {
        Object var_attrcontent13 = renderContext.call("xss", var_attrvalue12, "attribute");
        {
            boolean var_shoulddisplayattr15 = (((null != var_attrcontent13) && (!"".equals(var_attrcontent13))) && ((!"".equals(var_attrvalue12)) && (!((Object)false).equals(var_attrvalue12))));
            if (var_shoulddisplayattr15) {
                out.write(" buttonText");
                {
                    boolean var_istrueattr14 = (var_attrvalue12.equals(true));
                    if (!var_istrueattr14) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent13));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
{
    Object var_attrvalue16 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "projectImage1");
    {
        Object var_attrcontent17 = renderContext.call("xss", var_attrvalue16, "attribute");
        {
            boolean var_shoulddisplayattr19 = (((null != var_attrcontent17) && (!"".equals(var_attrcontent17))) && ((!"".equals(var_attrvalue16)) && (!((Object)false).equals(var_attrvalue16))));
            if (var_shoulddisplayattr19) {
                out.write(" productImage1");
                {
                    boolean var_istrueattr18 = (var_attrvalue16.equals(true));
                    if (!var_istrueattr18) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent17));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
{
    Object var_attrvalue20 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "projectImage2");
    {
        Object var_attrcontent21 = renderContext.call("xss", var_attrvalue20, "attribute");
        {
            boolean var_shoulddisplayattr23 = (((null != var_attrcontent21) && (!"".equals(var_attrcontent21))) && ((!"".equals(var_attrvalue20)) && (!((Object)false).equals(var_attrvalue20))));
            if (var_shoulddisplayattr23) {
                out.write(" productImage2");
                {
                    boolean var_istrueattr22 = (var_attrvalue20.equals(true));
                    if (!var_istrueattr22) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent21));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
{
    Object var_attrvalue24 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "projectImage3");
    {
        Object var_attrcontent25 = renderContext.call("xss", var_attrvalue24, "attribute");
        {
            boolean var_shoulddisplayattr27 = (((null != var_attrcontent25) && (!"".equals(var_attrcontent25))) && ((!"".equals(var_attrvalue24)) && (!((Object)false).equals(var_attrvalue24))));
            if (var_shoulddisplayattr27) {
                out.write(" productImage3");
                {
                    boolean var_istrueattr26 = (var_attrvalue24.equals(true));
                    if (!var_istrueattr26) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent25));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(">\n    </productcmp>\n    \n    <script type=\"text/x-template\" id=\"product-template\">\n        <div class=\"beej-product-hero-container\" id=\"productApp\">\n            <div class=\"beej-product-hero__image-viewer\">\n                <img class=\"beej-product-hero__image\" v-bind:src=\"image\">\n                <div class=\"beej-product-hero__image-thumbnails\">\n                    <img class=\"beej-product-hero__image-thumbnail\" src=\"{{ productImage1 }}\">\n                    <img class=\"beej-product-hero__image-thumbnail\" src=\"{{ productImage2 }}\">\n                    <img class=\"beej-product-hero__image-thumbnail\" src=\"{{ productImage3 }}\">\n                </div>\n            </div>\n            <div class=\"beej-product-hero__info\">\n                <h2 class=\"beej-product-hero__title\">{{ title }}</h2>\n                <p class=\"beej-product-hero__description\">{{ description }}</p>\n                <p class=\"beej-product-hero__description\">{{ price }}</p>\n                <button class=\"beej-product-hero-button\" v-bind:class=\"buttonColor\">{{ buttonText }}</button>\n            </div>\n        </div>\n    </script>\n</section>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

