// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scd.proto

package com.webank.wedpr.scd.proto;

public final class Scd {
    private Scd() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_webank_wedpr_scd_proto_CertificateSchema_descriptor;
    static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_webank_wedpr_scd_proto_CertificateSchema_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_webank_wedpr_scd_proto_StringToStringPair_descriptor;
    static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_webank_wedpr_scd_proto_StringToStringPair_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_webank_wedpr_scd_proto_CertificateTemplate_descriptor;
    static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_webank_wedpr_scd_proto_CertificateTemplate_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_webank_wedpr_scd_proto_TemplatePublicKey_descriptor;
    static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_webank_wedpr_scd_proto_TemplatePublicKey_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_webank_wedpr_scd_proto_TemplatePrivateKey_descriptor;
    static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_webank_wedpr_scd_proto_TemplatePrivateKey_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_webank_wedpr_scd_proto_AttributeDict_descriptor;
    static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_webank_wedpr_scd_proto_AttributeDict_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_webank_wedpr_scd_proto_BlindedCertificateSecret_descriptor;
    static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_webank_wedpr_scd_proto_BlindedCertificateSecret_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_webank_wedpr_scd_proto_CertificateSignature_descriptor;
    static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_webank_wedpr_scd_proto_CertificateSignature_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_webank_wedpr_scd_proto_Predicate_descriptor;
    static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_webank_wedpr_scd_proto_Predicate_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_webank_wedpr_scd_proto_VerificationRuleSet_descriptor;
    static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_webank_wedpr_scd_proto_VerificationRuleSet_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_webank_wedpr_scd_proto_SignCertificateRequest_descriptor;
    static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_webank_wedpr_scd_proto_SignCertificateRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_webank_wedpr_scd_proto_VerifyRequest_descriptor;
    static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_webank_wedpr_scd_proto_VerifyRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_webank_wedpr_scd_proto_ScdResult_descriptor;
    static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_webank_wedpr_scd_proto_ScdResult_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        String[] descriptorData = {
            "\n\tscd.proto\022\032com.webank.wedpr.scd.proto\""
                    + "+\n\021CertificateSchema\022\026\n\016attribute_name\030\001"
                    + " \003(\t\"0\n\022StringToStringPair\022\013\n\003key\030\001 \001(\t\022"
                    + "\r\n\005value\030\002 \001(\t\"\320\001\n\023CertificateTemplate\022I"
                    + "\n\022certificate_schema\030\001 \001(\0132-.com.webank."
                    + "wedpr.scd.proto.CertificateSchema\022\"\n\032tem"
                    + "plate_correctness_proof\030\002 \001(\t\022J\n\023templat"
                    + "e_public_key\030\003 \001(\0132-.com.webank.wedpr.sc"
                    + "d.proto.TemplatePublicKey\" \n\021TemplatePub"
                    + "licKey\022\013\n\003key\030\001 \001(\t\"!\n\022TemplatePrivateKe"
                    + "y\022\013\n\003key\030\001 \001(\t\"M\n\rAttributeDict\022<\n\004pair\030"
                    + "\001 \003(\0132..com.webank.wedpr.scd.proto.Strin"
                    + "gToStringPair\"v\n\030BlindedCertificateSecre"
                    + "t\022#\n\033blinded_certificate_secrets\030\001 \001(\t\0225"
                    + "\n-blinded_certificate_secrets_correctnes"
                    + "s_proof\030\002 \001(\t\"Z\n\024CertificateSignature\022\035\n"
                    + "\025certificate_signature\030\001 \001(\t\022#\n\033signatur"
                    + "e_correctness_proof\030\002 \001(\t\"T\n\tPredicate\022\026"
                    + "\n\016attribute_name\030\001 \001(\t\022\026\n\016predicate_type"
                    + "\030\002 \001(\t\022\027\n\017predicate_value\030\003 \001(\004\"z\n\023Verif"
                    + "icationRuleSet\022\037\n\027revealed_attribute_nam"
                    + "e\030\001 \003(\t\022B\n\023attribute_predicate\030\002 \003(\0132%.c"
                    + "om.webank.wedpr.scd.proto.Predicate\"\303\001\n\026"
                    + "SignCertificateRequest\022M\n\032certificate_at"
                    + "tribute_dict\030\001 \001(\0132).com.webank.wedpr.sc"
                    + "d.proto.AttributeDict\022#\n\033blinded_certifi"
                    + "cate_secrets\030\002 \001(\t\0225\n-blinded_certificat"
                    + "e_secrets_correctness_proof\030\003 \001(\t\"\226\001\n\rVe"
                    + "rifyRequest\022M\n\024certificate_template\030\001 \001("
                    + "\0132/.com.webank.wedpr.scd.proto.Certifica"
                    + "teTemplate\022\032\n\022verification_proof\030\002 \001(\t\022\032"
                    + "\n\022verification_nonce\030\003 \001(\t\"\201\005\n\tScdResult"
                    + "\022M\n\024certificate_template\030\001 \001(\0132/.com.web"
                    + "ank.wedpr.scd.proto.CertificateTemplate\022"
                    + "L\n\024template_private_key\030\002 \001(\0132..com.weba"
                    + "nk.wedpr.scd.proto.TemplatePrivateKey\022\024\n"
                    + "\014issuer_nonce\030\003 \001(\t\022O\n\025certificate_signa"
                    + "ture\030\004 \001(\01320.com.webank.wedpr.scd.proto."
                    + "CertificateSignature\022\022\n\nuser_nonce\030\005 \001(\t"
                    + "\022T\n\030sign_certificate_request\030\006 \001(\01322.com"
                    + ".webank.wedpr.scd.proto.SignCertificateR"
                    + "equest\022\030\n\020user_private_key\030\007 \001(\t\022,\n$cert"
                    + "ificate_secrets_blinding_factors\030\010 \001(\t\022\032"
                    + "\n\022verification_nonce\030\t \001(\t\022A\n\016verify_req"
                    + "uest\030\n \001(\0132).com.webank.wedpr.scd.proto."
                    + "VerifyRequest\022J\n\027revealed_attribute_dict"
                    + "\030\013 \001(\0132).com.webank.wedpr.scd.proto.Attr"
                    + "ibuteDict\022\023\n\013bool_result\030\014 \001(\010B\036\n\032com.we"
                    + "bank.wedpr.scd.protoP\001b\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_com_webank_wedpr_scd_proto_CertificateSchema_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_com_webank_wedpr_scd_proto_CertificateSchema_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_com_webank_wedpr_scd_proto_CertificateSchema_descriptor,
                        new String[] {
                            "AttributeName",
                        });
        internal_static_com_webank_wedpr_scd_proto_StringToStringPair_descriptor =
                getDescriptor().getMessageTypes().get(1);
        internal_static_com_webank_wedpr_scd_proto_StringToStringPair_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_com_webank_wedpr_scd_proto_StringToStringPair_descriptor,
                        new String[] {
                            "Key", "Value",
                        });
        internal_static_com_webank_wedpr_scd_proto_CertificateTemplate_descriptor =
                getDescriptor().getMessageTypes().get(2);
        internal_static_com_webank_wedpr_scd_proto_CertificateTemplate_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_com_webank_wedpr_scd_proto_CertificateTemplate_descriptor,
                        new String[] {
                            "CertificateSchema", "TemplateCorrectnessProof", "TemplatePublicKey",
                        });
        internal_static_com_webank_wedpr_scd_proto_TemplatePublicKey_descriptor =
                getDescriptor().getMessageTypes().get(3);
        internal_static_com_webank_wedpr_scd_proto_TemplatePublicKey_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_com_webank_wedpr_scd_proto_TemplatePublicKey_descriptor,
                        new String[] {
                            "Key",
                        });
        internal_static_com_webank_wedpr_scd_proto_TemplatePrivateKey_descriptor =
                getDescriptor().getMessageTypes().get(4);
        internal_static_com_webank_wedpr_scd_proto_TemplatePrivateKey_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_com_webank_wedpr_scd_proto_TemplatePrivateKey_descriptor,
                        new String[] {
                            "Key",
                        });
        internal_static_com_webank_wedpr_scd_proto_AttributeDict_descriptor =
                getDescriptor().getMessageTypes().get(5);
        internal_static_com_webank_wedpr_scd_proto_AttributeDict_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_com_webank_wedpr_scd_proto_AttributeDict_descriptor,
                        new String[] {
                            "Pair",
                        });
        internal_static_com_webank_wedpr_scd_proto_BlindedCertificateSecret_descriptor =
                getDescriptor().getMessageTypes().get(6);
        internal_static_com_webank_wedpr_scd_proto_BlindedCertificateSecret_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_com_webank_wedpr_scd_proto_BlindedCertificateSecret_descriptor,
                        new String[] {
                            "BlindedCertificateSecrets",
                            "BlindedCertificateSecretsCorrectnessProof",
                        });
        internal_static_com_webank_wedpr_scd_proto_CertificateSignature_descriptor =
                getDescriptor().getMessageTypes().get(7);
        internal_static_com_webank_wedpr_scd_proto_CertificateSignature_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_com_webank_wedpr_scd_proto_CertificateSignature_descriptor,
                        new String[] {
                            "CertificateSignature", "SignatureCorrectnessProof",
                        });
        internal_static_com_webank_wedpr_scd_proto_Predicate_descriptor =
                getDescriptor().getMessageTypes().get(8);
        internal_static_com_webank_wedpr_scd_proto_Predicate_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_com_webank_wedpr_scd_proto_Predicate_descriptor,
                        new String[] {
                            "AttributeName", "PredicateType", "PredicateValue",
                        });
        internal_static_com_webank_wedpr_scd_proto_VerificationRuleSet_descriptor =
                getDescriptor().getMessageTypes().get(9);
        internal_static_com_webank_wedpr_scd_proto_VerificationRuleSet_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_com_webank_wedpr_scd_proto_VerificationRuleSet_descriptor,
                        new String[] {
                            "RevealedAttributeName", "AttributePredicate",
                        });
        internal_static_com_webank_wedpr_scd_proto_SignCertificateRequest_descriptor =
                getDescriptor().getMessageTypes().get(10);
        internal_static_com_webank_wedpr_scd_proto_SignCertificateRequest_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_com_webank_wedpr_scd_proto_SignCertificateRequest_descriptor,
                        new String[] {
                            "CertificateAttributeDict",
                            "BlindedCertificateSecrets",
                            "BlindedCertificateSecretsCorrectnessProof",
                        });
        internal_static_com_webank_wedpr_scd_proto_VerifyRequest_descriptor =
                getDescriptor().getMessageTypes().get(11);
        internal_static_com_webank_wedpr_scd_proto_VerifyRequest_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_com_webank_wedpr_scd_proto_VerifyRequest_descriptor,
                        new String[] {
                            "CertificateTemplate", "VerificationProof", "VerificationNonce",
                        });
        internal_static_com_webank_wedpr_scd_proto_ScdResult_descriptor =
                getDescriptor().getMessageTypes().get(12);
        internal_static_com_webank_wedpr_scd_proto_ScdResult_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_com_webank_wedpr_scd_proto_ScdResult_descriptor,
                        new String[] {
                            "CertificateTemplate",
                            "TemplatePrivateKey",
                            "IssuerNonce",
                            "CertificateSignature",
                            "UserNonce",
                            "SignCertificateRequest",
                            "UserPrivateKey",
                            "CertificateSecretsBlindingFactors",
                            "VerificationNonce",
                            "VerifyRequest",
                            "RevealedAttributeDict",
                            "BoolResult",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
