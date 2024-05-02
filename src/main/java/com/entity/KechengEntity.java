package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 课程
 *
 * @author 
 * @email
 */
@TableName("kecheng")
public class KechengEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KechengEntity() {

	}

	public KechengEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 班主任
     */
    @TableField(value = "banzhuren_id")

    private Integer banzhurenId;


    /**
     * 课程编号
     */
    @TableField(value = "kecheng_uuid_number")

    private String kechengUuidNumber;


    /**
     * 课程名称
     */
    @TableField(value = "kecheng_name")

    private String kechengName;


    /**
     * 课程照片
     */
    @TableField(value = "kecheng_photo")

    private String kechengPhoto;


    /**
     * 上课时间
     */
    @TableField(value = "kecheng_shijian")

    private String kechengShijian;


    /**
     * 上课地点
     */
    @TableField(value = "kecheng_address")

    private String kechengAddress;


    /**
     * 最大选课人数
     */
    @TableField(value = "kecheng_number")

    private Integer kechengNumber;


    /**
     * 课程类型
     */
    @TableField(value = "kecheng_types")

    private Integer kechengTypes;


    /**
     * 课程介绍
     */
    @TableField(value = "kecheng_content")

    private String kechengContent;


    /**
     * 是否上架
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @TableField(value = "kecheng_delete")

    private Integer kechengDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：班主任
	 */
    public Integer getBanzhurenId() {
        return banzhurenId;
    }
    /**
	 * 获取：班主任
	 */

    public void setBanzhurenId(Integer banzhurenId) {
        this.banzhurenId = banzhurenId;
    }
    /**
	 * 设置：课程编号
	 */
    public String getKechengUuidNumber() {
        return kechengUuidNumber;
    }
    /**
	 * 获取：课程编号
	 */

    public void setKechengUuidNumber(String kechengUuidNumber) {
        this.kechengUuidNumber = kechengUuidNumber;
    }
    /**
	 * 设置：课程名称
	 */
    public String getKechengName() {
        return kechengName;
    }
    /**
	 * 获取：课程名称
	 */

    public void setKechengName(String kechengName) {
        this.kechengName = kechengName;
    }
    /**
	 * 设置：课程照片
	 */
    public String getKechengPhoto() {
        return kechengPhoto;
    }
    /**
	 * 获取：课程照片
	 */

    public void setKechengPhoto(String kechengPhoto) {
        this.kechengPhoto = kechengPhoto;
    }
    /**
	 * 设置：上课时间
	 */
    public String getKechengShijian() {
        return kechengShijian;
    }
    /**
	 * 获取：上课时间
	 */

    public void setKechengShijian(String kechengShijian) {
        this.kechengShijian = kechengShijian;
    }
    /**
	 * 设置：上课地点
	 */
    public String getKechengAddress() {
        return kechengAddress;
    }
    /**
	 * 获取：上课地点
	 */

    public void setKechengAddress(String kechengAddress) {
        this.kechengAddress = kechengAddress;
    }
    /**
	 * 设置：最大选课人数
	 */
    public Integer getKechengNumber() {
        return kechengNumber;
    }
    /**
	 * 获取：最大选课人数
	 */

    public void setKechengNumber(Integer kechengNumber) {
        this.kechengNumber = kechengNumber;
    }
    /**
	 * 设置：课程类型
	 */
    public Integer getKechengTypes() {
        return kechengTypes;
    }
    /**
	 * 获取：课程类型
	 */

    public void setKechengTypes(Integer kechengTypes) {
        this.kechengTypes = kechengTypes;
    }
    /**
	 * 设置：课程介绍
	 */
    public String getKechengContent() {
        return kechengContent;
    }
    /**
	 * 获取：课程介绍
	 */

    public void setKechengContent(String kechengContent) {
        this.kechengContent = kechengContent;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }
    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getKechengDelete() {
        return kechengDelete;
    }
    /**
	 * 获取：逻辑删除
	 */

    public void setKechengDelete(Integer kechengDelete) {
        this.kechengDelete = kechengDelete;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Kecheng{" +
            "id=" + id +
            ", banzhurenId=" + banzhurenId +
            ", kechengUuidNumber=" + kechengUuidNumber +
            ", kechengName=" + kechengName +
            ", kechengPhoto=" + kechengPhoto +
            ", kechengShijian=" + kechengShijian +
            ", kechengAddress=" + kechengAddress +
            ", kechengNumber=" + kechengNumber +
            ", kechengTypes=" + kechengTypes +
            ", kechengContent=" + kechengContent +
            ", shangxiaTypes=" + shangxiaTypes +
            ", kechengDelete=" + kechengDelete +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
