var showFinicityConnect = function (connectUrl, success, error) {
    cordova.exec(success, error, "Finicity", "connect", [connectUrl]);
};

window.showFinicityConnect = showFinicityConnect;
module.exports = showFinicityConnect;