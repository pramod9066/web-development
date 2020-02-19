$(document).ready(function () {
    $("#profile").click(function () {
        var username = $("#username").val();
        $.ajax({
            type: 'POST',
            url: 'http://192.168.90.203:9800/nw/api/identity/user/getProfile',
            data: '{"userNwId":"pramod"}',
            success: function (data) {
                console.log(data);
                userdetails = JSON.stringify(data);
                $.fn.user(userdetails);               
            },
            contentType: "application/json",
            dataType: 'json'
        });
    });
    // $.getJSON("http://192.168.90.206:9900/nw/api/utility/getNwCategoryList", function (data) {
    //     $.each(data, function (key, val) {
    //         var json = JSON.stringify(val);
    //         var categoryNames = JSON.parse(json);
    //         $(".content").append(categoryNames.newsCategoryName + " ");
    //     });
    // });

    $.fn.user = function(userdetails){
        var json = JSON.parse(userdetails);
        var username = json.nwResResult.username;
        $("#card-title").append(username);
    }
});

