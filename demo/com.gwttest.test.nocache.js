function com_gwttest_test(){var l='',B='" for "gwt:onLoadErrorFn"',z='" for "gwt:onPropertyErrorFn"',bc='"><\/script>',n='/',ib='00997464622C7F8864365790C4C6F5C3.cache.html',jb='3F89F7E210CD1E5548B242B356561943.cache.html',lb='4FA8F8158BECA72016DD30F7BFC6F2B9.cache.html',mb='689F3F125AED0FDC399DD21A73FC1F0B.cache.html',ac='<script id="',Ab='<script language="javascript" src="',Eb="<script>com_gwttest_test.onInjectionDone('com.gwttest.test')<\/script>",v='=',y='Bad handler "',ub='DOMContentLoaded',kb='F0260702045AB3A5D816F81205F0091D.cache.html',cc='SCRIPT',Fb='__gwt_marker_com.gwttest.test',o='base',q='clear.cache.gif',m='com.gwttest.test',zb='com_rednels_ofcgwt_callback.js',Bb='com_rednels_ofcgwt_callback.js"><\/script>',u='content',db='gecko',eb='gecko1_8',nb='gwt.hybrid',A='gwt:onLoadErrorFn',w='gwt:onPropertyErrorFn',t='gwt:property',tb='head',hb='hosted.html?com_gwttest_test',sb='href',bb='ie6',vb='iframe',p='img',wb="javascript:''",pb='link',r='meta',gb='moduleRequested',ab='msie',s='name',D='opera',xb='position:absolute;width:0;height:0;border:none',qb='rel',F='safari',yb='selectionDone',cb='selectionStart',x='startup',rb='stylesheet',Cb='swfobject.js',Db='swfobject.js"><\/script>',ob='test.css',fb='unknown',C='user.agent',E='webkit';var ec=window,k=document,mc=ec.external,dc=ec.__gwtstatsEvent?function(a,b,c,d){ec.__gwtstatsEvent(a,b,c,d)}:null,zc,pc,jc,ic=l,sc={},Cc=[],yc=[],hc=[],vc,xc;dc&&dc(m,x,cb,{millis:(new Date()).getTime()});if(!ec.__gwt_stylesLoaded){ec.__gwt_stylesLoaded={}}if(!ec.__gwt_scriptsLoaded){ec.__gwt_scriptsLoaded={}}function oc(){try{return mc&&(mc.gwtOnLoad&&ec.location.search.indexOf(nb)==-1)}catch(a){return false}}
function rc(){if(zc&&pc){var c=k.getElementById(m);var b=c.contentWindow;b.__gwt_initHandlers=com_gwttest_test.__gwt_initHandlers;if(oc()){b.__gwt_getProperty=function(a){return kc(a)}}com_gwttest_test=null;b.gwtOnLoad(vc,m,ic);dc&&dc(m,x,yb,{millis:(new Date()).getTime()})}}
function lc(){var j,h=Fb,i;k.write(ac+h+bc);i=k.getElementById(h);j=i&&i.previousSibling;while(j&&j.tagName!=cc){j=j.previousSibling}function d(b){var a=b.lastIndexOf(n);return a>=0?b.substring(0,a+1):l}
;if(j&&j.src){ic=d(j.src)}if(ic==l){var c=k.getElementsByTagName(o);if(c.length>0){ic=c[c.length-1].href}else{var g=k.location;var e=g.href;ic=d(e.substr(0,e.length-g.hash.length))}}else if(ic.match(/^\w+:\/\//)){}else{var f=k.createElement(p);f.src=ic+q;ic=d(f.src)}if(i){i.parentNode.removeChild(i)}}
function wc(){var f=document.getElementsByTagName(r);for(var d=0,g=f.length;d<g;++d){var e=f[d],h=e.getAttribute(s),b;if(h){if(h==t){b=e.getAttribute(u);if(b){var i,c=b.indexOf(v);if(c>=0){h=b.substring(0,c);i=b.substring(c+1)}else{h=b;i=l}sc[h]=i}}else if(h==w){b=e.getAttribute(u);if(b){try{xc=eval(b)}catch(a){alert(y+b+z)}}}else if(h==A){b=e.getAttribute(u);if(b){try{vc=eval(b)}catch(a){alert(y+b+B)}}}}}}
function Bc(d,e){var a=hc;for(var b=0,c=d.length-1;b<c;++b){a=a[d[b]]||(a[d[b]]=[])}a[d[c]]=e}
function kc(d){var e=yc[d](),b=Cc[d];if(e in b){return e}var a=[];for(var c in b){a[b[c]]=c}if(xc){xc(d,a,e)}throw null}
yc[C]=function(){var d=navigator.userAgent.toLowerCase();var b=function(a){return parseInt(a[1])*1000+parseInt(a[2])};if(d.indexOf(D)!=-1){return D}else if(d.indexOf(E)!=-1){return F}else if(d.indexOf(ab)!=-1){var c=/msie ([0-9]+)\.([0-9]+)/.exec(d);if(c&&c.length==3){if(b(c)>=6000){return bb}}}else if(d.indexOf(db)!=-1){var c=/rv:([0-9]+)\.([0-9]+)/.exec(d);if(c&&c.length==3){if(b(c)>=1008)return eb}return db}return fb};Cc[C]={gecko:0,gecko1_8:1,ie6:2,opera:3,safari:4};com_gwttest_test.onInjectionDone=function(){zc=true;dc&&dc(m,x,gb,{millis:(new Date()).getTime()});rc()};com_gwttest_test.onScriptLoad=function(){if(nc){pc=true;rc()}};lc();wc();var Ac;if(oc()){Ac=hb}else{try{Bc([bb],ib);Bc([D],jb);Bc([eb],kb);Bc([F],lb);Bc([db],mb);Ac=hc[kc(C)]}catch(a){return}}var uc;function tc(){if(!jc){jc=true;if(!__gwt_stylesLoaded[ob]){var a=k.createElement(pb);__gwt_stylesLoaded[ob]=a;a.setAttribute(qb,rb);a.setAttribute(sb,ic+ob);k.getElementsByTagName(tb)[0].appendChild(a)}rc();if(k.removeEventListener){k.removeEventListener(ub,tc,false)}if(uc){clearInterval(uc)}}}
var nc;function qc(){if(!nc){nc=true;var a=k.createElement(vb);a.src=wb;a.id=m;a.style.cssText=xb;a.tabIndex=-1;k.body.appendChild(a);a.contentWindow.location.replace(ic+Ac)}}
if(k.addEventListener){k.addEventListener(ub,function(){qc();tc()},false)}var uc=setInterval(function(){if(/loaded|complete/.test(k.readyState)){qc();tc()}},50);if(!__gwt_scriptsLoaded[zb]){__gwt_scriptsLoaded[zb]=true;document.write(Ab+ic+Bb)}if(!__gwt_scriptsLoaded[Cb]){__gwt_scriptsLoaded[Cb]=true;document.write(Ab+ic+Db)}k.write(Eb)}
com_gwttest_test.__gwt_initHandlers=function(i,e,j){var d=window,g=d.onresize,f=d.onbeforeunload,h=d.onunload;d.onresize=function(a){try{i()}finally{g&&g(a)}};d.onbeforeunload=function(a){var c,b;try{c=e()}finally{b=f&&f(a)}if(c!=null){return c}if(b!=null){return b}};d.onunload=function(a){try{j()}finally{h&&h(a)}}};com_gwttest_test();