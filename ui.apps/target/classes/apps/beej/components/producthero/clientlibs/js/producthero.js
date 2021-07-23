

/**
 * @class Product Hero
 * @description Product Hero
 * @extends default
 */
NS('beej').ProductHero = (function() {
    'use strict';

    /**
     * @function init
     * @description Init component.
     * @memberOf beej.ProductHero.
     * @returns {void}
     */
    var init = function() {
        var productComp = Vue.component('productcmp', {
            template: '#product-template',
            props: {
                title: {
                    type: String
                },
                description: {
                    type: String
                },
                buttonColor: {
                    type: String
                },
                buttonText: {
                    type: String
                }
            }
        });
        /**
        * Vue App definition
        */
        var vueApp = new Vue({
           el: '#productApp',
           data: patagoniaNanoData,
           components: {
               productComp: productComp
           }
        });
    };

    return {
        init: init
    };

})();