package Common.properties;



import Common.configs.XMLFunctions;

import java.io.File;

/**
 * @author Bogna 'bognix' Knychała
 */
public class Credentials {

  public String userName;
  public String password;

  /*public String userName2;
  public String password2;

  public String userName3;
  public String password3;

  public String userName4;
  public String password4;

  public String userName5;
  public String password5;

  public String userName6;
  public String password6;

  public String userName7;
  public String password7;

  public String userName8;
  public String password8;

  public String userName9;
  public String password9;

  public String userName10;
  public String password10;

  public String userName11;
  public String password11;

  public String userName12;
  public String password12;

  public String userName13;
  public String password13;

  public String userNameNonLatin;
  public String userNameNonLatinEncoded;
  public String passwordNonLatin;

  public String userNameWithUnderScore;
  public String passwordWithUnderScore;

  public String userNameWithBackwardSlash;
  public String userNameWithBackwardSlashEncoded;
  public String passwordWithBackwardSlash;

  public String userNameLong;
  public String passwordLong;

  public String userNameClosedAccount;
  public String passwordClosedAccount;

  public String userNameBlockedAccount;
  public String passwordBlockedAccount;

  public String email;
  public String emailPassword;
  public String emailQaart1;
  public String emailPasswordQaart1;
  public String emailQaart2;
  public String emailPasswordQaart2;
  public String emailQaart3;
  public String emailPasswordQaart3;
  public String emailQaart4;
  public String emailPasswordQaart4;

  public String userNameStaff;
  public String userNameStaffId;
  public String passwordStaff;

  public String userNameStaff2;
  public String passwordStaff2;

  public String userNameMonobook;
  public String passwordMonobook;

  public String userNameFB;
  public String passwordFB;
  public String emailFB;

  public String userNameBlocked;
  public String passwordBlocked;

  public String userNameForgottenPassword;
  public String userNameForgottenPassword2;

  public String geoEdgeUserName;
  public String geoEdgeUserPass;

  public String userNameVEPreferred;
  public String passwordVEPreferred;

  public String userNameCKPreferred;
  public String passwordCKPreferred;

  public String userNameSourcePreferred;
  public String passwordSourcePreferred;

  public String userNameDefaultPreferred;
  public String passwordDefaultPreferred;

  public String userNameSysop;
  public String passwordSysop;
*/
  public String apiToken;

  public Credentials(File credentialsFile) {
      System.out.println(credentialsFile.getAbsolutePath());
    userName = XMLFunctions.getXMLConfiguration(credentialsFile, "addon.username");
    password = XMLFunctions.getXMLConfiguration(credentialsFile, "addon.password");
//    userName2 = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.regular2.username");
//    password2 = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.regular2.password");
//    userName3 = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.regular3.username");
//    password3 = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.regular3.password");
//    userName4 = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.regular4.username");
//    password4 = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.regular4.password");
//    userName5 = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.regular5.username");
//    password5 = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.regular5.password");
//    userName6 = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.regular6.username");
//    password6 = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.regular6.password");
//    userName7 = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.regular7.username");
//    password7 = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.regular7.password");
//    userName8 = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.regular8.username");
//    password8 = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.regular8.password");
//    userName9 = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.regular9.username");
//    password9 = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.regular9.password");
//    userName10 = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.regular10.username");
//    password10 = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.regular10.password");
//    userName11 = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.regular11.username");
//    password11 = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.regular11.password");
//    userName12 = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.regular12.username");
//    password12 = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.regular12.password");
//    userName13 = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.regular13.username");
//    password13 = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.regular13.password");
//
//    userNameNonLatin =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.nonLatin.username");
//    userNameNonLatinEncoded =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.nonLatin.usernameenc");
//    passwordNonLatin =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.nonLatin.password");
//
//    userNameWithUnderScore =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.underscore.username");
//    passwordWithUnderScore =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.underscore.password");
//
//    userNameWithBackwardSlash =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.backwardslash.username");
//    userNameWithBackwardSlashEncoded =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.backwardslash.usernameenc");
//    passwordWithBackwardSlash =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.backwardslash.password");
//
//    userNameLong = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.long.username");
//    passwordLong = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.long.password");
//
//    userNameClosedAccount =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.closeAccountUser.username");
//    passwordClosedAccount =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.closeAccountUser.password");
//
//    userNameBlockedAccount =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.blockedAccountUser.username");
//    passwordBlockedAccount =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.blockedAccountUser.password");
//
//    userNameStaff =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.wikiastaff.username");
//    userNameStaffId = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.wikiastaff.id");
//    passwordStaff =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.wikiastaff.password");
//
//    userNameStaff2 =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.wikiastaff2.username");
//    passwordStaff2 =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.wikiastaff2.password");
//
//    userNameMonobook =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.wikiamonobook.username");
//    passwordMonobook =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.wikiamonobook.password");
//
//    emailFB = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.facebook.email");
//    passwordFB = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.facebook.password");
//    userNameFB = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.facebook.username");
//
//    email = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.email.generic.username");
//    emailPassword = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.email.generic.password");
//
//    emailQaart1 = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.email.qawikia1.username");
//    emailPasswordQaart1 =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.email.qawikia1.password");
//    emailQaart2 = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.email.qawikia2.username");
//    emailPasswordQaart2 =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.email.qawikia2.password");
//    emailQaart3 = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.email.qawikia3.username");
//    emailPasswordQaart3 =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.email.qawikia3.password");
//    emailQaart4 = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.email.qawikia4.username");
//    emailPasswordQaart4 =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.email.qawikia4.password");
//
//    userNameBlocked =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.tooManyLoginAttempts.username");
//    passwordBlocked =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.tooManyLoginAttempts.password");
//
//    userNameForgottenPassword =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.forgottenPassword.username1");
//    userNameForgottenPassword2 =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.forgottenPassword.username2");
//
//    geoEdgeUserName = XMLFunctions.getXMLConfiguration(credentialsFile,
//                                                       "ci.AdsConfig.GeoEdgeCredentials.userName");
//    geoEdgeUserPass = XMLFunctions.getXMLConfiguration(credentialsFile,
//                                                       "ci.AdsConfig.GeoEdgeCredentials.password");
//
//    userNameVEPreferred =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.vePreferredUser.username");
//    passwordVEPreferred =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.vePreferredUser.password");
//
//    userNameCKPreferred =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.ckPreferredUser.username");
//    passwordCKPreferred =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.ckPreferredUser.password");
//
//    userNameSourcePreferred =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.sourcePreferredUser.username");
//    passwordSourcePreferred =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.sourcePreferredUser.password");
//
//    userNameDefaultPreferred =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.defaultPreferredUser.username");
//    passwordDefaultPreferred =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.defaultPreferredUser.password");
//
//    userNameSysop =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.wikiasysop.username");
//    passwordSysop =
//        XMLFunctions.getXMLConfiguration(credentialsFile, "ci.user.wikiasysop.password");
//
//    apiToken = XMLFunctions.getXMLConfiguration(credentialsFile, "ci.api.token");
  }


}
