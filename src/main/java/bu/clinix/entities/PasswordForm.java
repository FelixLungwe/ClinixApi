package bu.clinix.entities;

public class PasswordForm
{
	private String oldPassword;
	private String newPassword;
	private String confirmPassword;
	private String confirmOldPassword;
	private boolean etat;
	
	
	/**
	 * @param oldPassword
	 * @param newPassword
	 * @param confirmPassword
	 * @param confirmOldPassword
	 * @param etat
	 */
	public PasswordForm(String oldPassword, String newPassword, String confirmPassword, String confirmOldPassword,
			boolean etat)
	{
		super();
		this.oldPassword = oldPassword;
		this.newPassword = newPassword;
		this.confirmPassword = confirmPassword;
		this.confirmOldPassword = confirmOldPassword;
		this.etat = etat;
	}
	/**
	 * @return the oldPassword
	 */
	public String getOldPassword()
	{
		return oldPassword;
	}
	/**
	 * @param oldPassword the oldPassword to set
	 */
	public void setOldPassword(String oldPassword)
	{
		this.oldPassword = oldPassword;
	}
	/**
	 * @return the newPassword
	 */
	public String getNewPassword()
	{
		return newPassword;
	}
	/**
	 * @param newPassword the newPassword to set
	 */
	public void setNewPassword(String newPassword)
	{
		this.newPassword = newPassword;
	}
	/**
	 * @return the confirmPassword
	 */
	public String getConfirmPassword()
	{
		return confirmPassword;
	}
	/**
	 * @param confirmPassword the confirmPassword to set
	 */
	public void setConfirmPassword(String confirmPassword)
	{
		this.confirmPassword = confirmPassword;
	}
	/**
	 * @return the etat
	 */
	public boolean isEtat()
	{
		return etat;
	}
	/**
	 * @param etat the etat to set
	 */
	public void setEtat(boolean etat)
	{
		this.etat = etat;
	}
	/**
	 * @return the confirmOldPassword
	 */
	public String getConfirmOldPassword()
	{
		return confirmOldPassword;
	}
	/**
	 * @param confirmOldPassword the confirmOldPassword to set
	 */
	public void setConfirmOldPassword(String confirmOldPassword)
	{
		this.confirmOldPassword = confirmOldPassword;
	}
	
	
}
