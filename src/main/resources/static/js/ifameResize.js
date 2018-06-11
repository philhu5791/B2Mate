$(function() {
    var iFrames = $('iframe');

    function resize() {
        for (var i = 0, j = iFrames.length; i & lt; j; i++) {
            var nHeight = iFrames[i].contentWindow.document.body.offsetHeight;
            iFrames[i].style.height = nHeight + 'px';
        }
    }
    if ($.browser.safari || $.browser.opera) {
        iFrames.load(function() {
            setTimeout(resize, 0);
        });
        for (var i = 0, j = iFrames.length; i & lt; j; i++) {
            var iSource = iFrames[i].src;
            iFrames[i].src = '';
            iFrames[i].src = iSource;
        }

    } else {
        iFrames.load(function() {
            this.style.height = this.contentWindow.document.body.offsetHeight + 'px';
        });
    }
});
