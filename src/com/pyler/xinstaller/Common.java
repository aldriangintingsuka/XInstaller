package com.pyler.xinstaller;

import java.io.File;

import android.os.Build;
import android.os.Environment;

public class Common {
	// utils
	public static final String ACTION_BACKUP_APK_FILE = "xinstaller.intent.action.BACKUP_APK_FILE";
	public static final String ACTION_DELETE_APK_FILE = "xinstaller.intent.action.DELETE_APK_FILE";
	public static final String ACTION_UNINSTALL_SYSTEM_APP = "xinstaller.intent.action.UNINSTALL_SYSTEM_APP";
	public static final String ACTION_BACKUP_PREFERENCES = "xinstaller.intent.action.BACKUP_PREFERENCES";
	public static final String ACTION_RESTORE_PREFERENCES = "xinstaller.intent.action.RESTORE_PREFERENCES";
	public static final String ACTION_RESET_PREFERENCES = "xinstaller.intent.action.RESET_PREFERENCES";

	public static final String FILE = "file";
	public static final String PREFERENCE = "preference";
	public static final String VALUE = "value";
	public static final String PACKAGE = "package";

	// prefs
	public static final String PREF_ENABLE_MODULE = "enable_module";
	public static final String PREF_ENABLE_EXPERT_MODE = "enable_expert_mode";
	public static final String PREF_DISABLE_CHECK_SIGNATURE = "disable_check_signatures";
	public static final String PREF_DISABLE_CHECK_PERMISSION = "disable_check_permissions";
	public static final String PREF_ENABLED_DOWNGRADE_APP = "enable_downgrade_apps";
	public static final String PREF_DISABLE_CHECK_SIGNATURE_FDROID = "disable_check_signatures_fdroid";
	public static final String PREF_DISABLE_VERIFY_APP = "disable_verify_apps";
	public static final String PREF_ENABLE_AUTO_UNINSTALL = "enable_auto_uninstall";
	public static final String PREF_ENABLE_AUTO_INSTALL = "enable_auto_install";
	public static final String PREF_ENABLE_KEEP_APP_DATA = "enable_keep_apps_data";
	public static final String PREF_ENABLE_INSTALL_UNKNOWN_APP = "enable_install_unknown_apps";
	public static final String PREF_ENABLE_UNINSTALL_DEVICE_ADMIN = "enable_uninstall_device_admins";
	public static final String PREF_DISABLE_FORWARD_LOCK = "disable_forward_lock";
	public static final String PREF_ENABLE_DISABLE_SYSTEM_APP = "enable_disable_system_apps";
	public static final String PREF_ENABLE_AUTO_CLOSE_UNINSTALL = "enable_auto_close_uninstall";
	public static final String PREF_ENABLE_AUTO_CLOSE_INSTALL = "enable_auto_close_install";
	public static final String PREF_ENABLE_LAUNCH_INSTALL = "enable_auto_launch_install";
	public static final String PREF_ENABLE_INSTALL_EXTERNAL_STORAGE = "enable_install_external_storage";
	public static final String PREF_ENABLE_BACKUP_APP_PACKAGE = "enable_backup_app_packages";
	public static final String PREF_ENABLE_BACKUP_APK_FILE = "enable_backup_apk_files";
	public static final String PREF_ENABLE_INSTALL_UNSIGNED_APP = "enable_install_unsigned_apps";
	public static final String PREF_DISABLE_VERIFY_JAR = "disable_verify_jar";
	public static final String PREF_DISABLE_VERIFY_SIGNATURE = "disable_verify_signatures";
	public static final String PREF_ENABLE_SHOW_BUTTON = "enable_show_buttons";
	public static final String PREF_ENABLE_DEBUG_APP = "enable_debug_apps";
	public static final String PREF_ENABLE_AUTO_BACKUP = "enable_auto_backup";
	public static final String PREF_ENABLE_SHOW_PACKAGE_NAME = "enable_show_package_name";
	public static final String PREF_ENABLE_SHOW_VERSION = "enable_show_version";
	public static final String PREF_ENABLE_DELETE_APK_FILE_INSTALL = "enable_delete_apk_files_install";
	public static final String PREF_ENABLE_MOVE_APP = "enable_move_apps";
	public static final String PREF_DISABLE_CHECK_SDK_VERSION = "disable_check_sdk_version";
	public static final String PREF_DISABLE_INSTALL_BACKGROUND = "disable_install_background";
	public static final String PREF_DISABLE_UNINSTALL_BACKGROUND = "disable_uninstall_background";
	public static final String PREF_ENABLE_LAUNCH_APP = "enable_launch_apps";
	public static final String PREF_DISABLE_CHECK_DUPLICATED_PERMISSION = "disable_check_duplicated_permissions";
	public static final String PREF_ENABLE_EXPORT_APP = "enable_export_apps";
	public static final String PREF_ENABLE_OPEN_APP_GOOGLE_PLAY = "enable_open_apps_google_play";
	public static final String PREF_ENABLE_UNINSTALL_SYSTEM_APP = "enable_uninstall_system_apps";
	public static final String PREF_ENABLE_AUTO_ENABLE_CLEAR_BUTTON = "enable_auto_enable_clear_buttons";
	public static final String PREF_ENABLE_AUTO_HIDE_INSTALL = "enable_auto_hide_install";
	public static final String PREF_DISABLE_CHECK_LUCKY_PATCHER = "disable_check_lucky_patcher";
	public static final String PREF_ENABLE_CHANGE_DEVICE_PROPERTIES = "enable_change_device_properties";
	public static final String PREF_ENABLE_BACKUP_ALL_APPS = "enable_backup_all_apps";

	public static final String PREF_DEVICE_MODEL = "device_model";
	public static final String PREF_DEVICE_MANUFACTURER = "device_manufacturer";
	public static final String PREF_DEVICE_PRODUCT = "device_product";
	public static final String PREF_DEVICE_BOARD = "device_board";
	public static final String PREF_DEVICE_HARDWARE = "device_hardware";
	public static final String PREF_DEVICE_TAGS = "device_tags";
	public static final String[][] DEVICE_PROPERTIES = {
			{ Common.PREF_DEVICE_MODEL, Build.MODEL },
			{ Common.PREF_DEVICE_MANUFACTURER, Build.MANUFACTURER },
			{ Common.PREF_DEVICE_PRODUCT, Build.PRODUCT },
			{ Common.PREF_DEVICE_BOARD, Build.BOARD },
			{ Common.PREF_DEVICE_HARDWARE, Build.HARDWARE },
			{ Common.PREF_DEVICE_TAGS, Build.TAGS } };

	// constants
	public static final String PACKAGE_NAME = Common.class.getPackage()
			.getName();
	public static final String PACKAGE_PREFERENCES = PACKAGE_NAME
			+ "_preferences";
	public static final String PACKAGE_TAG = "XInstaller";
	public static final String APP_DIR = Environment
			.getExternalStorageDirectory()
			+ File.separator
			+ PACKAGE_TAG
			+ File.separator;
	public static final File PACKAGE_DIR = new File(APP_DIR);
	public static final File PREFERENCES_BACKUP_FILE = new File(APP_DIR
			+ File.separator + PACKAGE_TAG + ".backup");
	public static final String URL_HELP = "http://pyler.wen.ru/XInstaller/Help.html";
	public static final int SDK = Build.VERSION.SDK_INT;
	public static final int LATEST_ANDROID_RELEASE = Build.VERSION_CODES.LOLLIPOP_MR1;
	public static final String EMPTY_STRING = "";
	public static final String ANDROID_PKG = "android";
	public static final String PACKAGEINSTALLER_PKG = "com.android.packageinstaller";
	public static final String SETTINGS_PKG = "com.android.settings";
	public static final String FDROID_PKG = "org.fdroid.fdroid";
	public static final String BACKUPCONFIRM_PKG = "com.android.backupconfirm";
	public static final String GOOGLEPLAY_PKG = "com.android.vending";
	public static final String LUCKYPATCHER_PKG = "com.android.vending.billing.InAppBillingService.LUCK";

	// checks
	public static final boolean JB_NEWER = SDK >= Build.VERSION_CODES.JELLY_BEAN;
	public static final boolean JB_MR1_NEWER = SDK >= Build.VERSION_CODES.JELLY_BEAN_MR1;
	public static final boolean JB_MR2_NEWER = SDK >= Build.VERSION_CODES.JELLY_BEAN_MR2;
	public static final boolean KITKAT_NEWER = SDK >= Build.VERSION_CODES.KITKAT;
	public static final boolean LOLLIPOP_NEWER = SDK >= Build.VERSION_CODES.LOLLIPOP;

	// classes
	public static final String PACKAGEMANAGERSERVICE = "com.android.server.pm.PackageManagerService";
	public static final String DEVICEPOLICYMANAGERSERVICE = (LOLLIPOP_NEWER) ? "com.android.server.devicepolicy.DevicePolicyManagerService"
			: "com.android.server.DevicePolicyManagerService";
	public static final String INSTALLEDAPPDETAILS = "com.android.settings.applications.InstalledAppDetails";
	public static final String PACKAGEINSTALLERACTIVITY = "com.android.packageinstaller.PackageInstallerActivity";
	public static final String INSTALLAPPPROGRESS = "com.android.packageinstaller.InstallAppProgress";
	public static final String CANBEONSDCARDCHECKER = "com.android.settings.applications.CanBeOnSdCardChecker";
	public static final String UNINSTALLERACTIVITY = "com.android.packageinstaller.UninstallerActivity";
	public static final String UNINSTALLAPPPROGRESS = "com.android.packageinstaller.UninstallAppProgress";
	public static final String FDROIDAPPDETAILS = "org.fdroid.fdroid.AppDetails";
	public static final String PACKAGEPARSER = "android.content.pm.PackageParser";
	public static final String JARVERIFIER = "java.util.jar.JarVerifier$VerifierEntry";
	public static final String SIGNATURE = "java.security.Signature";
	public static final String BACKUPRESTORECONFIRMATION = "com.android.backupconfirm.BackupRestoreConfirmation";
	public static final String PACKAGEMANAGERREPOSITORY = "com.google.android.finsky.appstate.PackageManagerRepository";
	public static final String UTILS = "com.android.settings.Utils";

	// flags
	public static final int DELETE_KEEP_DATA = 0x00000001;
	public static final int INSTALL_ALLOW_DOWNGRADE = 0x00000080;
	public static final int INSTALL_FORWARD_LOCK = 0x00000001;
	public static final int INSTALL_EXTERNAL = 0x00000008;
	public static final int DEBUG_ENABLE_DEBUGGER = 0x1;
	public static final int ROOT_UID = 0;
	public static final int SYSTEM_UID = 1000;
	public static final int INSTALL_SUCCEEDED = 1;
}
