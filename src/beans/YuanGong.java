package beans;
import javax.persistence.Entity;
import javax.persistence.Table;
//import javax.persistence.UniqueConstraint;
import javax.persistence.Id;
import javax.persistence.IdClass;

import org.hibernate.validator.Length;

import beans.pk.YuanGongPk;

import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import javax.persistence.Column;
/**
* 员工
**/
@Entity
@Table(name = "HR_YUANGONG"
//	,uniqueConstraints = {@UniqueConstraint(columnNames = {"BMNO", "ZWNO", "ENO"})}
		)
@IdClass(YuanGongPk.class)
public class YuanGong {
    private java.lang.String ENO;	//工号
    private java.lang.String IDNO;	//身份证号
    private java.lang.String BMNO;	//部门编号
    private java.lang.String ZWNO;	//职务编号
    private java.lang.String PHONE;	//办公电话
    private java.lang.String EMAIL;	//办公邮箱
    /**
     * @return ENO 工号
     */
    @Id
    @Column(name = "ENO", length = 10)
    public java.lang.String getENO() {
        return ENO;
    }
    /**
     * @param ENO 工号
     */
    public void setENO(java.lang.String ENO) {
        this.ENO = ENO;
    }
    /**
     * @return IDNO 身份证号
     */
    @Column(name = "IDNO", length = 18)
    public java.lang.String getIDNO() {
        return IDNO;
    }
    /**
     * @param IDNO 身份证号
     */
    public void setIDNO(java.lang.String IDNO) {
        this.IDNO = IDNO;
    }
    /**
     * @return BMNO 部门编号
     */
    @Id
    @Column(name = "BMNO", length = 10)
    public java.lang.String getBMNO() {
        return BMNO;
    }
    /**
     * @param BMNO 部门编号
     */
    public void setBMNO(java.lang.String BMNO) {
        this.BMNO = BMNO;
    }
    /**
     * @return ZWNO 职务编号
     */
    @Id
    @Column(name = "ZWNO", length = 4)
    public java.lang.String getZWNO() {
        return ZWNO;
    }
    /**
     * @param ZWNO 职务编号
     */
    public void setZWNO(java.lang.String ZWNO) {
        this.ZWNO = ZWNO;
    }
    /**
     * @return PHONE 办公电话
     */
    @Length(max = 50)
    @Column(name = "PHONE")
    public java.lang.String getPHONE() {
        return PHONE;
    }
    /**
     * @param PHONE 办公电话
     */
    public void setPHONE(java.lang.String PHONE) {
        this.PHONE = PHONE;
    }
    /**
     * @return EMAIL 办公邮箱
     */
    @Length(max = 100)
    @Column(name = "EMAIL")
    public java.lang.String getEMAIL() {
        return EMAIL;
    }
    /**
     * @param EMAIL 办公邮箱
     */
    public void setEMAIL(java.lang.String EMAIL) {
        this.EMAIL = EMAIL;
    }
    
    
    private RenYuan renyuan;		//人员
    /**
     * @return renyuan 人员
     */
    @OneToOne
    @JoinColumn(name = "IDNO", referencedColumnName = "IDNO", insertable = false, updatable = false)
    @NotFound(action = NotFoundAction.IGNORE)
    public RenYuan getRenyuan() {
    	return renyuan;
    }
    /**
     * @param renyuan 人员
     */
    public void setRenyuan(RenYuan renyuan) {
    	this.renyuan = renyuan;
    }
    
    
    
    private BuMenZhiWu bumenzhiwu;	//部门职务
    /**
     * @return bumenzhiwu 部门职务
     */
    @ManyToOne
    @JoinColumns({
    	@JoinColumn(name = "BMNO", referencedColumnName = "BMNO", insertable = false, updatable = false),
    	@JoinColumn(name = "ZWNO", referencedColumnName = "ZWNO", insertable = false, updatable = false)
    	})
    @NotFound(action = NotFoundAction.IGNORE)
    public BuMenZhiWu getBumenzhiwu() {
    	return bumenzhiwu;
    }
    /**
     * @param bumenzhiwu 部门职务
     */
    public void setBumenzhiwu(BuMenZhiWu bumenzhiwu) {
    	this.bumenzhiwu = bumenzhiwu;
    }
    
}
