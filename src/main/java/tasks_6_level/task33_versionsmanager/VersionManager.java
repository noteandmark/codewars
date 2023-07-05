package tasks_6_level.task33_versionsmanager;

public class VersionManager {
	int major;
	int minor;
	int patch;

	public VersionManager(String initialVersion) {
		if (initialVersion == null || initialVersion.isEmpty()) {
			initialVersion = "0.0.1";
		}
	}

	public void parseVersion(String initialVersion) {
		String[] versions = initialVersion.split("\\.");

		try {
			major = Integer.parseInt(versions[0]);
			minor = Integer.parseInt(versions[1]);
			patch = Integer.parseInt(versions[1]);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Error occured while parsing version!");
		}

	}

	public void major() {
		// must increase MAJOR by 1, set MINOR and PATCH to 0

	}

	public int getMajor() {
		return major;
	}

	public void setMajor(int major) {
		this.major = major;
	}

	public int getMinor() {
		return minor;
	}

	public void setMinor(int minor) {
		this.minor = minor;
	}

	public int getPatch() {
		return patch;
	}

	public void setPatch(int patch) {
		this.patch = patch;
	}

	public void minor() {

	}

	public void patch() {

	}

	public void rollback() {

	}

	public String release() {
		return null;
	}

}
