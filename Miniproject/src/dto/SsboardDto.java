package dto;

public class SsboardDto {
	int ssbno;
	String sstitle;
	String sscontent;
	String sswriter;
	String ssWriteDate;
	String sscontents;
	int sslike;
	int ssview;
	int totalNum;
	public SsboardDto(int ssbno, String sstitle, String sscontent, String sswriter, String ssWriteDate,
			String sscontents, int sslike, int ssview, int totalNum) {
		this.ssbno = ssbno;
		this.sstitle = sstitle;
		this.sscontent = sscontent;
		this.sswriter = sswriter;
		this.ssWriteDate = ssWriteDate;
		this.sscontents = sscontents;
		this.sslike = sslike;
		this.ssview = ssview;
		this.totalNum = totalNum;
	}
	public int getSsbno() {
		return ssbno;
	}
	public void setSsbno(int ssbno) {
		this.ssbno = ssbno;
	}
	public String getSstitle() {
		return sstitle;
	}
	public void setSstitle(String sstitle) {
		this.sstitle = sstitle;
	}
	public String getSscontent() {
		return sscontent;
	}
	public void setSscontent(String sscontent) {
		this.sscontent = sscontent;
	}
	public String getSswriter() {
		return sswriter;
	}
	public void setSswriter(String sswriter) {
		this.sswriter = sswriter;
	}
	public String getSsWriteDate() {
		return ssWriteDate;
	}
	public void setSsWriteDate(String ssWriteDate) {
		this.ssWriteDate = ssWriteDate;
	}
	public String getSscontents() {
		return sscontents;
	}
	public void setSscontents(String sscontents) {
		this.sscontents = sscontents;
	}
	public int getSslike() {
		return sslike;
	}
	public void setSslike(int sslike) {
		this.sslike = sslike;
	}
	public int getSsview() {
		return ssview;
	}
	public void setSsview(int ssview) {
		this.ssview = ssview;
	}
	public int getTotalNum() {
		return totalNum;
	}
	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
	}
	
	
	
}
