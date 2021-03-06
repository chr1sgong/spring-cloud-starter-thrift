/**
 * Autogenerated by Thrift Compiler (0.10.0)
 * <p>
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package io.ostenant.rpc.thrift.examples.thrift.entities;


import io.ostenant.rpc.thrift.examples.thrift.enums.ThriftDepositStatus;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-11-21")
public class ThriftDeposit implements org.apache.thrift.TBase<ThriftDeposit, ThriftDeposit._Fields>, java.io.Serializable, Cloneable, Comparable<ThriftDeposit> {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftDeposit");

    private static final org.apache.thrift.protocol.TField SERIAL_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("serialNumber", org.apache.thrift.protocol.TType.STRING, (short) 1);
    private static final org.apache.thrift.protocol.TField TRANSACTION_AMOUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("transactionAmount", org.apache.thrift.protocol.TType.DOUBLE, (short) 2);
    private static final org.apache.thrift.protocol.TField SUBMITTED_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("submittedTime", org.apache.thrift.protocol.TType.STRING, (short) 3);
    private static final org.apache.thrift.protocol.TField FINISHED_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("finishedTime", org.apache.thrift.protocol.TType.STRING, (short) 4);
    private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short) 5);
    private static final org.apache.thrift.protocol.TField DEPOSIT_CARD_FIELD_DESC = new org.apache.thrift.protocol.TField("depositCard", org.apache.thrift.protocol.TType.STRUCT, (short) 6);

    private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ThriftDepositStandardSchemeFactory();
    private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ThriftDepositTupleSchemeFactory();

    public String serialNumber; // required
    public double transactionAmount; // required
    public String submittedTime; // required
    public String finishedTime; // optional
    /**
     * @see ThriftDepositStatus
     */
    public ThriftDepositStatus status; // optional
    public ThriftDepositCard depositCard; // optional

    /**
     * The set of fields this struct contains, along with convenience methods for finding and manipulating them.
     */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
        SERIAL_NUMBER((short) 1, "serialNumber"),
        TRANSACTION_AMOUNT((short) 2, "transactionAmount"),
        SUBMITTED_TIME((short) 3, "submittedTime"),
        FINISHED_TIME((short) 4, "finishedTime"),
        /**
         * @see ThriftDepositStatus
         */
        STATUS((short) 5, "status"),
        DEPOSIT_CARD((short) 6, "depositCard");

        private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

        static {
            for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
                byName.put(field.getFieldName(), field);
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, or null if its not found.
         */
        public static _Fields findByThriftId(int fieldId) {
            switch (fieldId) {
                case 1: // SERIAL_NUMBER
                    return SERIAL_NUMBER;
                case 2: // TRANSACTION_AMOUNT
                    return TRANSACTION_AMOUNT;
                case 3: // SUBMITTED_TIME
                    return SUBMITTED_TIME;
                case 4: // FINISHED_TIME
                    return FINISHED_TIME;
                case 5: // STATUS
                    return STATUS;
                case 6: // DEPOSIT_CARD
                    return DEPOSIT_CARD;
                default:
                    return null;
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, throwing an exception
         * if it is not found.
         */
        public static _Fields findByThriftIdOrThrow(int fieldId) {
            _Fields fields = findByThriftId(fieldId);
            if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            return fields;
        }

        /**
         * Find the _Fields constant that matches name, or null if its not found.
         */
        public static _Fields findByName(String name) {
            return byName.get(name);
        }

        private final short _thriftId;
        private final String _fieldName;

        _Fields(short thriftId, String fieldName) {
            _thriftId = thriftId;
            _fieldName = fieldName;
        }

        public short getThriftFieldId() {
            return _thriftId;
        }

        public String getFieldName() {
            return _fieldName;
        }
    }

    // isset id assignments
    private static final int __TRANSACTIONAMOUNT_ISSET_ID = 0;
    private byte __isset_bitfield = 0;
    private static final _Fields optionals[] = {_Fields.FINISHED_TIME, _Fields.STATUS, _Fields.DEPOSIT_CARD};
    public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;

    static {
        java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.SERIAL_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("serialNumber", org.apache.thrift.TFieldRequirementType.REQUIRED,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.TRANSACTION_AMOUNT, new org.apache.thrift.meta_data.FieldMetaData("transactionAmount", org.apache.thrift.TFieldRequirementType.REQUIRED,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
        tmpMap.put(_Fields.SUBMITTED_TIME, new org.apache.thrift.meta_data.FieldMetaData("submittedTime", org.apache.thrift.TFieldRequirementType.REQUIRED,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.FINISHED_TIME, new org.apache.thrift.meta_data.FieldMetaData("finishedTime", org.apache.thrift.TFieldRequirementType.OPTIONAL,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.OPTIONAL,
                new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ThriftDepositStatus.class)));
        tmpMap.put(_Fields.DEPOSIT_CARD, new org.apache.thrift.meta_data.FieldMetaData("depositCard", org.apache.thrift.TFieldRequirementType.OPTIONAL,
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThriftDepositCard.class)));
        metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftDeposit.class, metaDataMap);
    }

    public ThriftDeposit() {
    }

    public ThriftDeposit(
            String serialNumber,
            double transactionAmount,
            String submittedTime) {
        this();
        this.serialNumber = serialNumber;
        this.transactionAmount = transactionAmount;
        setTransactionAmountIsSet(true);
        this.submittedTime = submittedTime;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public ThriftDeposit(ThriftDeposit other) {
        __isset_bitfield = other.__isset_bitfield;
        if (other.isSetSerialNumber()) {
            this.serialNumber = other.serialNumber;
        }
        this.transactionAmount = other.transactionAmount;
        if (other.isSetSubmittedTime()) {
            this.submittedTime = other.submittedTime;
        }
        if (other.isSetFinishedTime()) {
            this.finishedTime = other.finishedTime;
        }
        if (other.isSetStatus()) {
            this.status = other.status;
        }
        if (other.isSetDepositCard()) {
            this.depositCard = new ThriftDepositCard(other.depositCard);
        }
    }

    public ThriftDeposit deepCopy() {
        return new ThriftDeposit(this);
    }

    @Override
    public void clear() {
        this.serialNumber = null;
        setTransactionAmountIsSet(false);
        this.transactionAmount = 0.0;
        this.submittedTime = null;
        this.finishedTime = null;
        this.status = null;
        this.depositCard = null;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public ThriftDeposit setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    public void unsetSerialNumber() {
        this.serialNumber = null;
    }

    /**
     * Returns true if field serialNumber is set (has been assigned a value) and false otherwise
     */
    public boolean isSetSerialNumber() {
        return this.serialNumber != null;
    }

    public void setSerialNumberIsSet(boolean value) {
        if (!value) {
            this.serialNumber = null;
        }
    }

    public double getTransactionAmount() {
        return this.transactionAmount;
    }

    public ThriftDeposit setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
        setTransactionAmountIsSet(true);
        return this;
    }

    public void unsetTransactionAmount() {
        __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TRANSACTIONAMOUNT_ISSET_ID);
    }

    /**
     * Returns true if field transactionAmount is set (has been assigned a value) and false otherwise
     */
    public boolean isSetTransactionAmount() {
        return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TRANSACTIONAMOUNT_ISSET_ID);
    }

    public void setTransactionAmountIsSet(boolean value) {
        __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TRANSACTIONAMOUNT_ISSET_ID, value);
    }

    public String getSubmittedTime() {
        return this.submittedTime;
    }

    public ThriftDeposit setSubmittedTime(String submittedTime) {
        this.submittedTime = submittedTime;
        return this;
    }

    public void unsetSubmittedTime() {
        this.submittedTime = null;
    }

    /**
     * Returns true if field submittedTime is set (has been assigned a value) and false otherwise
     */
    public boolean isSetSubmittedTime() {
        return this.submittedTime != null;
    }

    public void setSubmittedTimeIsSet(boolean value) {
        if (!value) {
            this.submittedTime = null;
        }
    }

    public String getFinishedTime() {
        return this.finishedTime;
    }

    public ThriftDeposit setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }

    public void unsetFinishedTime() {
        this.finishedTime = null;
    }

    /**
     * Returns true if field finishedTime is set (has been assigned a value) and false otherwise
     */
    public boolean isSetFinishedTime() {
        return this.finishedTime != null;
    }

    public void setFinishedTimeIsSet(boolean value) {
        if (!value) {
            this.finishedTime = null;
        }
    }

    /**
     * @see ThriftDepositStatus
     */
    public ThriftDepositStatus getStatus() {
        return this.status;
    }

    /**
     * @see ThriftDepositStatus
     */
    public ThriftDeposit setStatus(ThriftDepositStatus status) {
        this.status = status;
        return this;
    }

    public void unsetStatus() {
        this.status = null;
    }

    /**
     * Returns true if field status is set (has been assigned a value) and false otherwise
     */
    public boolean isSetStatus() {
        return this.status != null;
    }

    public void setStatusIsSet(boolean value) {
        if (!value) {
            this.status = null;
        }
    }

    public ThriftDepositCard getDepositCard() {
        return this.depositCard;
    }

    public ThriftDeposit setDepositCard(ThriftDepositCard depositCard) {
        this.depositCard = depositCard;
        return this;
    }

    public void unsetDepositCard() {
        this.depositCard = null;
    }

    /**
     * Returns true if field depositCard is set (has been assigned a value) and false otherwise
     */
    public boolean isSetDepositCard() {
        return this.depositCard != null;
    }

    public void setDepositCardIsSet(boolean value) {
        if (!value) {
            this.depositCard = null;
        }
    }

    public void setFieldValue(_Fields field, Object value) {
        switch (field) {
            case SERIAL_NUMBER:
                if (value == null) {
                    unsetSerialNumber();
                } else {
                    setSerialNumber((String) value);
                }
                break;

            case TRANSACTION_AMOUNT:
                if (value == null) {
                    unsetTransactionAmount();
                } else {
                    setTransactionAmount((Double) value);
                }
                break;

            case SUBMITTED_TIME:
                if (value == null) {
                    unsetSubmittedTime();
                } else {
                    setSubmittedTime((String) value);
                }
                break;

            case FINISHED_TIME:
                if (value == null) {
                    unsetFinishedTime();
                } else {
                    setFinishedTime((String) value);
                }
                break;

            case STATUS:
                if (value == null) {
                    unsetStatus();
                } else {
                    setStatus((ThriftDepositStatus) value);
                }
                break;

            case DEPOSIT_CARD:
                if (value == null) {
                    unsetDepositCard();
                } else {
                    setDepositCard((ThriftDepositCard) value);
                }
                break;

        }
    }

    public Object getFieldValue(_Fields field) {
        switch (field) {
            case SERIAL_NUMBER:
                return getSerialNumber();

            case TRANSACTION_AMOUNT:
                return getTransactionAmount();

            case SUBMITTED_TIME:
                return getSubmittedTime();

            case FINISHED_TIME:
                return getFinishedTime();

            case STATUS:
                return getStatus();

            case DEPOSIT_CARD:
                return getDepositCard();

        }
        throw new IllegalStateException();
    }

    /**
     * Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
     */
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }

        switch (field) {
            case SERIAL_NUMBER:
                return isSetSerialNumber();
            case TRANSACTION_AMOUNT:
                return isSetTransactionAmount();
            case SUBMITTED_TIME:
                return isSetSubmittedTime();
            case FINISHED_TIME:
                return isSetFinishedTime();
            case STATUS:
                return isSetStatus();
            case DEPOSIT_CARD:
                return isSetDepositCard();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if (that == null)
            return false;
        if (that instanceof ThriftDeposit)
            return this.equals((ThriftDeposit) that);
        return false;
    }

    public boolean equals(ThriftDeposit that) {
        if (that == null)
            return false;
        if (this == that)
            return true;

        boolean this_present_serialNumber = true && this.isSetSerialNumber();
        boolean that_present_serialNumber = true && that.isSetSerialNumber();
        if (this_present_serialNumber || that_present_serialNumber) {
            if (!(this_present_serialNumber && that_present_serialNumber))
                return false;
            if (!this.serialNumber.equals(that.serialNumber))
                return false;
        }

        boolean this_present_transactionAmount = true;
        boolean that_present_transactionAmount = true;
        if (this_present_transactionAmount || that_present_transactionAmount) {
            if (!(this_present_transactionAmount && that_present_transactionAmount))
                return false;
            if (this.transactionAmount != that.transactionAmount)
                return false;
        }

        boolean this_present_submittedTime = true && this.isSetSubmittedTime();
        boolean that_present_submittedTime = true && that.isSetSubmittedTime();
        if (this_present_submittedTime || that_present_submittedTime) {
            if (!(this_present_submittedTime && that_present_submittedTime))
                return false;
            if (!this.submittedTime.equals(that.submittedTime))
                return false;
        }

        boolean this_present_finishedTime = true && this.isSetFinishedTime();
        boolean that_present_finishedTime = true && that.isSetFinishedTime();
        if (this_present_finishedTime || that_present_finishedTime) {
            if (!(this_present_finishedTime && that_present_finishedTime))
                return false;
            if (!this.finishedTime.equals(that.finishedTime))
                return false;
        }

        boolean this_present_status = true && this.isSetStatus();
        boolean that_present_status = true && that.isSetStatus();
        if (this_present_status || that_present_status) {
            if (!(this_present_status && that_present_status))
                return false;
            if (!this.status.equals(that.status))
                return false;
        }

        boolean this_present_depositCard = true && this.isSetDepositCard();
        boolean that_present_depositCard = true && that.isSetDepositCard();
        if (this_present_depositCard || that_present_depositCard) {
            if (!(this_present_depositCard && that_present_depositCard))
                return false;
            if (!this.depositCard.equals(that.depositCard))
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hashCode = 1;

        hashCode = hashCode * 8191 + ((isSetSerialNumber()) ? 131071 : 524287);
        if (isSetSerialNumber())
            hashCode = hashCode * 8191 + serialNumber.hashCode();

        hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(transactionAmount);

        hashCode = hashCode * 8191 + ((isSetSubmittedTime()) ? 131071 : 524287);
        if (isSetSubmittedTime())
            hashCode = hashCode * 8191 + submittedTime.hashCode();

        hashCode = hashCode * 8191 + ((isSetFinishedTime()) ? 131071 : 524287);
        if (isSetFinishedTime())
            hashCode = hashCode * 8191 + finishedTime.hashCode();

        hashCode = hashCode * 8191 + ((isSetStatus()) ? 131071 : 524287);
        if (isSetStatus())
            hashCode = hashCode * 8191 + status.getValue();

        hashCode = hashCode * 8191 + ((isSetDepositCard()) ? 131071 : 524287);
        if (isSetDepositCard())
            hashCode = hashCode * 8191 + depositCard.hashCode();

        return hashCode;
    }

    @Override
    public int compareTo(ThriftDeposit other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = Boolean.valueOf(isSetSerialNumber()).compareTo(other.isSetSerialNumber());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetSerialNumber()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.serialNumber, other.serialNumber);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetTransactionAmount()).compareTo(other.isSetTransactionAmount());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetTransactionAmount()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.transactionAmount, other.transactionAmount);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetSubmittedTime()).compareTo(other.isSetSubmittedTime());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetSubmittedTime()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.submittedTime, other.submittedTime);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetFinishedTime()).compareTo(other.isSetFinishedTime());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetFinishedTime()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.finishedTime, other.finishedTime);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetStatus()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetDepositCard()).compareTo(other.isSetDepositCard());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetDepositCard()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.depositCard, other.depositCard);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        return 0;
    }

    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        scheme(iprot).read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
        scheme(oprot).write(oprot, this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ThriftDeposit(");
        boolean first = true;

        sb.append("serialNumber:");
        if (this.serialNumber == null) {
            sb.append("null");
        } else {
            sb.append(this.serialNumber);
        }
        first = false;
        if (!first) sb.append(", ");
        sb.append("transactionAmount:");
        sb.append(this.transactionAmount);
        first = false;
        if (!first) sb.append(", ");
        sb.append("submittedTime:");
        if (this.submittedTime == null) {
            sb.append("null");
        } else {
            sb.append(this.submittedTime);
        }
        first = false;
        if (isSetFinishedTime()) {
            if (!first) sb.append(", ");
            sb.append("finishedTime:");
            if (this.finishedTime == null) {
                sb.append("null");
            } else {
                sb.append(this.finishedTime);
            }
            first = false;
        }
        if (isSetStatus()) {
            if (!first) sb.append(", ");
            sb.append("status:");
            if (this.status == null) {
                sb.append("null");
            } else {
                sb.append(this.status);
            }
            first = false;
        }
        if (isSetDepositCard()) {
            if (!first) sb.append(", ");
            sb.append("depositCard:");
            if (this.depositCard == null) {
                sb.append("null");
            } else {
                sb.append(this.depositCard);
            }
            first = false;
        }
        sb.append(")");
        return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
        // check for required fields
        if (serialNumber == null) {
            throw new org.apache.thrift.protocol.TProtocolException("Required field 'serialNumber' was not present! Struct: " + toString());
        }
        // alas, we cannot check 'transactionAmount' because it's a primitive and you chose the non-beans generator.
        if (submittedTime == null) {
            throw new org.apache.thrift.protocol.TProtocolException("Required field 'submittedTime' was not present! Struct: " + toString());
        }
        // check for sub-struct validity
        if (depositCard != null) {
            depositCard.validate();
        }
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        try {
            write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
        try {
            // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
            __isset_bitfield = 0;
            read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private static class ThriftDepositStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
        public ThriftDepositStandardScheme getScheme() {
            return new ThriftDepositStandardScheme();
        }
    }

    private static class ThriftDepositStandardScheme extends org.apache.thrift.scheme.StandardScheme<ThriftDeposit> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, ThriftDeposit struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 1: // SERIAL_NUMBER
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.serialNumber = iprot.readString();
                            struct.setSerialNumberIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 2: // TRANSACTION_AMOUNT
                        if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
                            struct.transactionAmount = iprot.readDouble();
                            struct.setTransactionAmountIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 3: // SUBMITTED_TIME
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.submittedTime = iprot.readString();
                            struct.setSubmittedTimeIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 4: // FINISHED_TIME
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.finishedTime = iprot.readString();
                            struct.setFinishedTimeIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 5: // STATUS
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                            struct.status = ThriftDepositStatus.findByValue(iprot.readI32());
                            struct.setStatusIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 6: // DEPOSIT_CARD
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                            struct.depositCard = new ThriftDepositCard();
                            struct.depositCard.read(iprot);
                            struct.setDepositCardIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    default:
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            // check for required fields of primitive type, which can't be checked in the validate method
            if (!struct.isSetTransactionAmount()) {
                throw new org.apache.thrift.protocol.TProtocolException("Required field 'transactionAmount' was not found in serialized data! Struct: " + toString());
            }
            struct.validate();
        }

        public void write(org.apache.thrift.protocol.TProtocol oprot, ThriftDeposit struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            if (struct.serialNumber != null) {
                oprot.writeFieldBegin(SERIAL_NUMBER_FIELD_DESC);
                oprot.writeString(struct.serialNumber);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(TRANSACTION_AMOUNT_FIELD_DESC);
            oprot.writeDouble(struct.transactionAmount);
            oprot.writeFieldEnd();
            if (struct.submittedTime != null) {
                oprot.writeFieldBegin(SUBMITTED_TIME_FIELD_DESC);
                oprot.writeString(struct.submittedTime);
                oprot.writeFieldEnd();
            }
            if (struct.finishedTime != null) {
                if (struct.isSetFinishedTime()) {
                    oprot.writeFieldBegin(FINISHED_TIME_FIELD_DESC);
                    oprot.writeString(struct.finishedTime);
                    oprot.writeFieldEnd();
                }
            }
            if (struct.status != null) {
                if (struct.isSetStatus()) {
                    oprot.writeFieldBegin(STATUS_FIELD_DESC);
                    oprot.writeI32(struct.status.getValue());
                    oprot.writeFieldEnd();
                }
            }
            if (struct.depositCard != null) {
                if (struct.isSetDepositCard()) {
                    oprot.writeFieldBegin(DEPOSIT_CARD_FIELD_DESC);
                    struct.depositCard.write(oprot);
                    oprot.writeFieldEnd();
                }
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class ThriftDepositTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
        public ThriftDepositTupleScheme getScheme() {
            return new ThriftDepositTupleScheme();
        }
    }

    private static class ThriftDepositTupleScheme extends org.apache.thrift.scheme.TupleScheme<ThriftDeposit> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, ThriftDeposit struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
            oprot.writeString(struct.serialNumber);
            oprot.writeDouble(struct.transactionAmount);
            oprot.writeString(struct.submittedTime);
            java.util.BitSet optionals = new java.util.BitSet();
            if (struct.isSetFinishedTime()) {
                optionals.set(0);
            }
            if (struct.isSetStatus()) {
                optionals.set(1);
            }
            if (struct.isSetDepositCard()) {
                optionals.set(2);
            }
            oprot.writeBitSet(optionals, 3);
            if (struct.isSetFinishedTime()) {
                oprot.writeString(struct.finishedTime);
            }
            if (struct.isSetStatus()) {
                oprot.writeI32(struct.status.getValue());
            }
            if (struct.isSetDepositCard()) {
                struct.depositCard.write(oprot);
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, ThriftDeposit struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
            struct.serialNumber = iprot.readString();
            struct.setSerialNumberIsSet(true);
            struct.transactionAmount = iprot.readDouble();
            struct.setTransactionAmountIsSet(true);
            struct.submittedTime = iprot.readString();
            struct.setSubmittedTimeIsSet(true);
            java.util.BitSet incoming = iprot.readBitSet(3);
            if (incoming.get(0)) {
                struct.finishedTime = iprot.readString();
                struct.setFinishedTimeIsSet(true);
            }
            if (incoming.get(1)) {
                struct.status = ThriftDepositStatus.findByValue(iprot.readI32());
                struct.setStatusIsSet(true);
            }
            if (incoming.get(2)) {
                struct.depositCard = new ThriftDepositCard();
                struct.depositCard.read(iprot);
                struct.setDepositCardIsSet(true);
            }
        }
    }

    private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
        return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
    }
}

