package tasks_6_level.task33_versionsmanager;

import java.util.ArrayList;
import java.util.List;

public class VersionManager {
	int major;
	int minor;
	int patch;
	private List<Version> versionHistory;

	public VersionManager() {
		this("");
	}

	public VersionManager(String initialVersion) {
		if (initialVersion == null || initialVersion.isEmpty()) {
			initialVersion = "0.0.1";
		}
		parseVersion(initialVersion);
		versionHistory = new ArrayList<>();
	}

	private static class Version {
		private int major;
		private int minor;
		private int patch;

		private Version(int major, int minor, int patch) {
			this.major = major;
			this.minor = minor;
			this.patch = patch;
		}
	}

	public void parseVersion(String version) {
		String[] parts = version.split("\\.");

		try {
			major = Integer.parseInt(parts[0]);
			if (!(parts.length < 3)) {
				minor = Integer.parseInt(parts[1]);
				patch = Integer.parseInt(parts[2]);
			} else {
				if (parts.length == 1) {
					minor = 0;
					patch = 0;
				} else {
					minor = Integer.parseInt(parts[1]);
					patch = 0;
				}
			}
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Error occured while parsing version!");
		}

	}

	public VersionManager major() {
		// increase MAJOR by 1, set MINOR and PATCH to 0
		versionHistory.add(new Version(major, minor, patch));
		major++;
		minor = 0;
		patch = 0;
		return this; // Return the instance of VersionManager
	}

	public VersionManager minor() {
		// increase MINOR by 1, set PATCH to 0
		versionHistory.add(new Version(major, minor, patch));
		minor++;
		patch = 0;
		return this;
	}

	public VersionManager patch() {
		// increase PATCH by 1
		versionHistory.add(new Version(major, minor, patch));
		patch++;
		return this;
	}

	public VersionManager rollback() {
		/*
		 * return the MAJOR, MINOR, and PATCH to their values before the previous
		 * major/minor/patch call, or throw an exception with the message
		 * "Cannot rollback!" if there's no version to roll back to. Multiple calls to
		 * rollback() should be possible and restore the version history release() -
		 * return a string in the format "{MAJOR}.{MINOR}.{PATCH}"
		 */
		if (versionHistory.isEmpty()) {
			throw new IllegalStateException("Cannot rollback!");
		}

		Version lastVersion = versionHistory.remove(versionHistory.size() - 1);
		major = lastVersion.major;
		minor = lastVersion.minor;
		patch = lastVersion.patch;
		return this;
	}

	public String release() {
		// return a string in the format "{MAJOR}.{MINOR}.{PATCH}
		return major + "." + minor + "." + patch;
	}

}
