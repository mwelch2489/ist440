import java.sql.Timestamp;

public class Group {

	private int groupId;
	private int groupCategoryId;
	private int ownerId;
	private int campusId;
	private int memberId;
	private String groupName;
	private boolean requiresApproval;
	private Timestamp dateOfCreation;
	private String location;
	private int maxGroupSize;
	private String notes;
	
	public String Group () {
		return null;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public int getGroupCategoryId() {
		return groupCategoryId;
	}

	public void setGroupCategoryId(int groupCategoryId) {
		this.groupCategoryId = groupCategoryId;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public int getCampusId() {
		return campusId;
	}

	public void setCampusId(int campusId) {
		this.campusId = campusId;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public boolean isRequiresApproval() {
		return requiresApproval;
	}

	public void setRequiresApproval(boolean requiresApproval) {
		this.requiresApproval = requiresApproval;
	}

	public Timestamp getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(Timestamp dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getMaxGroupSize() {
		return maxGroupSize;
	}

	public void setMaxGroupSize(int maxGroupSize) {
		this.maxGroupSize = maxGroupSize;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
}
