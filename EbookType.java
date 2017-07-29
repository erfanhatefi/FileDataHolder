package com.company;

/**
 * Created by randkill on 5/21/17.
 */
public enum EbookType
{
    HTML("html"),
    IBOOKS("ibooks"),
    PRC("prc"),
    DOC("doc"),
    DOCX("docx"),
    EPUB("epub"),
    PDB("pdb"),
    FB2("fb2"),
    XEB("xeb"),
    CEB("ceb"),
    OPF("opf"),
    PDF("pdf"),
    TXT("txt"),
    PDG("pdg"),
    XML("xml");


    private String EbookType;
    private EbookType(String Ebooktype)
    {
        this.EbookType = Ebooktype;
    }
    public String getEbookType()
    {
        return EbookType;
    }
}