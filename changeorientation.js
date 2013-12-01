var ChangeOrientation = { 
    setOrientation: function (success, fail, result) { 
      return cordova.exec( success, fail, 
                           "ChangeOrientation", 
                           "changeOrientation", [result]);
    } 
};