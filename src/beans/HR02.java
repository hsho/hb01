package beans;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernate.validator.Length;

import beans.pk.HR02pk;




/**
 * 部门岗位班别
 * 
 * @author hs
 * 
 * @version 20180910 created
 *
 */
@Entity
@Table(name = "HR02")
@IdClass(HR02pk.class)
public class HR02 implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4682042517413510277L;
	
	
	
	/**
	 * 当后面的时间 小于 前面的时间时, 表示凌晨跨夜
	 */
	private String dept;
	private String tid;
	private String remark;
	private String beg1;
	private String end1;
	private String beg2;
	private String end2;
	private String beg3;
	private String end3;
	private String beg4;
	private String end4;
	
	
	
	private HR01 hr01;
	
	/**
	 * 部门岗位
	 * 
	 * @return the hr01
	 */
	@ManyToOne
	@JoinColumn(name="DEPT", referencedColumnName="DEPT", insertable=false, updatable=false)
    @NotFound(action=NotFoundAction.IGNORE)
	public HR01 getHr01() {
		return hr01;
	}
	/**
	 * @param hr01 the hr01 to set
	 */
	public void setHr01(HR01 hr01) {
		this.hr01 = hr01;
	}
	
	
	
	
	/**
	 * 部门代号
	 * 
	 * @return the dept
	 */
	@Id
//	@Column(name = "DEPT")
//	@Length(max=30)
	public String getDept() {
		return dept;
	}
	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	/**
	 * 班别代号
	 * 
	 * @return the tid
	 */
	@Id
//	@Column(name = "TID")
//	@Length(max=1)
	public String getTid() {
		return tid;
	}
	/**
	 * @param tid the tid to set
	 */
	public void setTid(String tid) {
		this.tid = tid;
	}
	
	
	/**
	 * 班别备注
	 * 
	 * @return the remark
	 */
	@Length(max = 50)
	@Column(name = "REMARK")
	public String getRemark() {
		return remark;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	
	/**
	 * 时间段1开始时间
	 * 
	 * @return the beg1
	 */
	@Column(name = "BEG1")
	@Length(max = 4)
	public String getBeg1() {
		return beg1;
	}
	/**
	 * @param beg1 the beg1 to set
	 */
	public void setBeg1(String beg1) {
		this.beg1 = beg1;
	}
	
	
	/**
	 * 时间段1结束时间
	 * 
	 * @return the end1
	 */
	@Column(name = "END1")
	@Length(max = 4)
	public String getEnd1() {
		return end1;
	}
	/**
	 * @param end1 the end1 to set
	 */
	public void setEnd1(String end1) {
		this.end1 = end1;
	}
	
	
	/**
	 * 时间段2开始时间
	 * 
	 * @return the beg2
	 */
	@Column(name = "BEG2")
	@Length(max = 4)
	public String getBeg2() {
		return beg2;
	}
	/**
	 * @param beg2 the beg2 to set
	 */
	public void setBeg2(String beg2) {
		this.beg2 = beg2;
	}
	
	
	/**
	 * 时间段2结束时间
	 * 
	 * @return the end2
	 */
	@Column(name = "END2")
	@Length(max = 4)
	public String getEnd2() {
		return end2;
	}
	/**
	 * @param end2 the end2 to set
	 */
	public void setEnd2(String end2) {
		this.end2 = end2;
	}
	
	
	/**
	 * 时间段3开始时间
	 * 
	 * @return the beg3
	 */
	@Column(name = "BEG3")
	@Length(max = 4)
	public String getBeg3() {
		return beg3;
	}
	/**
	 * @param beg3 the beg3 to set
	 */
	public void setBeg3(String beg3) {
		this.beg3 = beg3;
	}
	
	
	/**
	 * 时间段3结束时间
	 * 
	 * @return the end3
	 */
	@Column(name = "END3")
	@Length(max = 4)
	public String getEnd3() {
		return end3;
	}
	/**
	 * @param end3 the end3 to set
	 */
	public void setEnd3(String end3) {
		this.end3 = end3;
	}
	
	
	/**
	 * 时间段4开始时间
	 * 
	 * @return the beg4
	 */
	@Column(name = "BEG4")
	@Length(max = 4)
	public String getBeg4() {
		return beg4;
	}
	/**
	 * @param beg4 the beg4 to set
	 */
	public void setBeg4(String beg4) {
		this.beg4 = beg4;
	}
	
	
	/**
	 * 时间段4结束时间
	 * 
	 * @return the end4
	 */
	@Column(name = "END4")
	@Length(max = 4)
	public String getEnd4() {
		return end4;
	}
	/**
	 * @param end4 the end4 to set
	 */
	public void setEnd4(String end4) {
		this.end4 = end4;
	}
	
	
	
	
}
