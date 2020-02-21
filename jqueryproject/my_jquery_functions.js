$(document).ready(function () {
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
    // $.getJSON("http://192.168.90.206:9900/nw/api/utility/getNwCategoryList", function (data) {
    //     $.each(data, function (key, val) {
    //         var json = JSON.stringify(val);
    //         var categoryNames = JSON.parse(json);
    //         $(".content").append(categoryNames.newsCategoryName + " ");
    //     });
    // });

    $.fn.user = function (userdetails) {
        var json = JSON.parse(userdetails);
        var username = json.nwResResult.username;
        var email = json.nwResResult.email;
        //  $("#print").html('<h3>The following are the list: </h3> <ul style="list-style: square"> <li>first line in the list </li><li>second line in the list </li></ul>');
        $("#name").text(username).css("color", "black");
        $("#email").text(email).css("color", "black");
        $(".card-title").append(username).css("color", "black");
        $(".card-email").append(email).css("color", "black");
        $(".card-phone").append(json.nwResResult.phoneNumber).css("color", "black");
    }

    $("#myBtn").click(function () {
        $("#myModal").modal();
    });

});

