$(document).ready(function () {
    var body = '{ "userNwId": "kumar" }';
    $("#post").click(function () {
        $.post("http://192.168.90.203:9800/nw/api/identity/user/getProfile",
            body,
            function (data) {
               var json = JSON.parse(data);
                $("#result").html(json);
            });
    });

});


    // $.getJSON("http://192.168.90.206:9900/nw/api/utility/getNwCategoryList", function (data) {
    //     $.each(data, function (key, val) {
    //         var json = JSON.stringify(val);
    //         var categoryNames = JSON.parse(json);
    //         $(".content").append(categoryNames.newsCategoryName + " ");
    //     });
    // });