package eu.atollgroup.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by adam on 2016.10.17..
 */
@Entity
@Table(name = "internal_companies", schema = "szechenyi")
public class InternalCompaniesEntity {
    private Integer id;
    private String crefoId;
    private String mainActivityId;
    private String mainActivity;
    private String taxNumber;
    private String registrationNumber;
    private String companyName;
    private String companyShortName;
    private String legalFormId;
    private String legalFormText;
    private String zipcode;
    private String city;
    private String street;
    private String lat;
    private String lng;
    private String web;
    private String email;
    private String foundedDate;
    private String capital;
    private String lastBalanceDate;
    private String lastTurnover;
    private String lastEmployee;
    private String vitalityIndex;
    private boolean isPublic;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Timestamp deletedAt;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "crefo_id")
    public String getCrefoId() {
        return crefoId;
    }

    public void setCrefoId(String crefoId) {
        this.crefoId = crefoId;
    }

    @Basic
    @Column(name = "main_activity_id")
    public String getMainActivityId() {
        return mainActivityId;
    }

    public void setMainActivityId(String mainActivityId) {
        this.mainActivityId = mainActivityId;
    }

    @Basic
    @Column(name = "main_activity")
    public String getMainActivity() {
        return mainActivity;
    }

    public void setMainActivity(String mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Basic
    @Column(name = "tax_number")
    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    @Basic
    @Column(name = "registration_number")
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Basic
    @Column(name = "company_name")
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Basic
    @Column(name = "company_short_name")
    public String getCompanyShortName() {
        return companyShortName;
    }

    public void setCompanyShortName(String companyShortName) {
        this.companyShortName = companyShortName;
    }

    @Basic
    @Column(name = "legal_form_id")
    public String getLegalFormId() {
        return legalFormId;
    }

    public void setLegalFormId(String legalFormId) {
        this.legalFormId = legalFormId;
    }

    @Basic
    @Column(name = "legal_form_text")
    public String getLegalFormText() {
        return legalFormText;
    }

    public void setLegalFormText(String legalFormText) {
        this.legalFormText = legalFormText;
    }

    @Basic
    @Column(name = "zipcode")
    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "street")
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Basic
    @Column(name = "lat")
    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    @Basic
    @Column(name = "lng")
    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    @Basic
    @Column(name = "web")
    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "founded_date")
    public String getFoundedDate() {
        return foundedDate;
    }

    public void setFoundedDate(String foundedDate) {
        this.foundedDate = foundedDate;
    }

    @Basic
    @Column(name = "capital")
    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    @Basic
    @Column(name = "last_balance_date")
    public String getLastBalanceDate() {
        return lastBalanceDate;
    }

    public void setLastBalanceDate(String lastBalanceDate) {
        this.lastBalanceDate = lastBalanceDate;
    }

    @Basic
    @Column(name = "last_turnover")
    public String getLastTurnover() {
        return lastTurnover;
    }

    public void setLastTurnover(String lastTurnover) {
        this.lastTurnover = lastTurnover;
    }

    @Basic
    @Column(name = "last_employee")
    public String getLastEmployee() {
        return lastEmployee;
    }

    public void setLastEmployee(String lastEmployee) {
        this.lastEmployee = lastEmployee;
    }

    @Basic
    @Column(name = "vitality_index")
    public String getVitalityIndex() {
        return vitalityIndex;
    }

    public void setVitalityIndex(String vitalityIndex) {
        this.vitalityIndex = vitalityIndex;
    }

    @Basic
    @Column(name = "is_public")
    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    @Basic
    @Column(name = "created_at")
    @CreationTimestamp
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updated_at")
    @UpdateTimestamp
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Basic
    @Column(name = "deleted_at")
    public Timestamp getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Timestamp deletedAt) {
        this.deletedAt = deletedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InternalCompaniesEntity that = (InternalCompaniesEntity) o;

        if (id != that.id) return false;
        if (isPublic != that.isPublic) return false;
        if (crefoId != null ? !crefoId.equals(that.crefoId) : that.crefoId != null) return false;
        if (mainActivityId != null ? !mainActivityId.equals(that.mainActivityId) : that.mainActivityId != null)
            return false;
        if (mainActivity != null ? !mainActivity.equals(that.mainActivity) : that.mainActivity != null) return false;
        if (taxNumber != null ? !taxNumber.equals(that.taxNumber) : that.taxNumber != null) return false;
        if (registrationNumber != null ? !registrationNumber.equals(that.registrationNumber) : that.registrationNumber != null)
            return false;
        if (companyName != null ? !companyName.equals(that.companyName) : that.companyName != null) return false;
        if (companyShortName != null ? !companyShortName.equals(that.companyShortName) : that.companyShortName != null)
            return false;
        if (legalFormId != null ? !legalFormId.equals(that.legalFormId) : that.legalFormId != null) return false;
        if (legalFormText != null ? !legalFormText.equals(that.legalFormText) : that.legalFormText != null)
            return false;
        if (zipcode != null ? !zipcode.equals(that.zipcode) : that.zipcode != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (street != null ? !street.equals(that.street) : that.street != null) return false;
        if (lat != null ? !lat.equals(that.lat) : that.lat != null) return false;
        if (lng != null ? !lng.equals(that.lng) : that.lng != null) return false;
        if (web != null ? !web.equals(that.web) : that.web != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (foundedDate != null ? !foundedDate.equals(that.foundedDate) : that.foundedDate != null) return false;
        if (capital != null ? !capital.equals(that.capital) : that.capital != null) return false;
        if (lastBalanceDate != null ? !lastBalanceDate.equals(that.lastBalanceDate) : that.lastBalanceDate != null)
            return false;
        if (lastTurnover != null ? !lastTurnover.equals(that.lastTurnover) : that.lastTurnover != null) return false;
        if (lastEmployee != null ? !lastEmployee.equals(that.lastEmployee) : that.lastEmployee != null) return false;
        if (vitalityIndex != null ? !vitalityIndex.equals(that.vitalityIndex) : that.vitalityIndex != null)
            return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;
        if (deletedAt != null ? !deletedAt.equals(that.deletedAt) : that.deletedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (crefoId != null ? crefoId.hashCode() : 0);
        result = 31 * result + (mainActivityId != null ? mainActivityId.hashCode() : 0);
        result = 31 * result + (mainActivity != null ? mainActivity.hashCode() : 0);
        result = 31 * result + (taxNumber != null ? taxNumber.hashCode() : 0);
        result = 31 * result + (registrationNumber != null ? registrationNumber.hashCode() : 0);
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        result = 31 * result + (companyShortName != null ? companyShortName.hashCode() : 0);
        result = 31 * result + (legalFormId != null ? legalFormId.hashCode() : 0);
        result = 31 * result + (legalFormText != null ? legalFormText.hashCode() : 0);
        result = 31 * result + (zipcode != null ? zipcode.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (lat != null ? lat.hashCode() : 0);
        result = 31 * result + (lng != null ? lng.hashCode() : 0);
        result = 31 * result + (web != null ? web.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (foundedDate != null ? foundedDate.hashCode() : 0);
        result = 31 * result + (capital != null ? capital.hashCode() : 0);
        result = 31 * result + (lastBalanceDate != null ? lastBalanceDate.hashCode() : 0);
        result = 31 * result + (lastTurnover != null ? lastTurnover.hashCode() : 0);
        result = 31 * result + (lastEmployee != null ? lastEmployee.hashCode() : 0);
        result = 31 * result + (vitalityIndex != null ? vitalityIndex.hashCode() : 0);
        result = 31 * result + (isPublic ? 1 : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        result = 31 * result + (deletedAt != null ? deletedAt.hashCode() : 0);
        return result;
    }
}
