
package soapws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soapws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Count_QNAME = new QName("http://soapws/", "count");
    private final static QName _CountResponse_QNAME = new QName("http://soapws/", "countResponse");
    private final static QName _Create_QNAME = new QName("http://soapws/", "create");
    private final static QName _Edit_QNAME = new QName("http://soapws/", "edit");
    private final static QName _Find_QNAME = new QName("http://soapws/", "find");
    private final static QName _FindAll_QNAME = new QName("http://soapws/", "findAll");
    private final static QName _FindAllResponse_QNAME = new QName("http://soapws/", "findAllResponse");
    private final static QName _FindConTitulo_QNAME = new QName("http://soapws/", "findConTitulo");
    private final static QName _FindConTituloResponse_QNAME = new QName("http://soapws/", "findConTituloResponse");
    private final static QName _FindRange_QNAME = new QName("http://soapws/", "findRange");
    private final static QName _FindRangeResponse_QNAME = new QName("http://soapws/", "findRangeResponse");
    private final static QName _FindResponse_QNAME = new QName("http://soapws/", "findResponse");
    private final static QName _GetAll_QNAME = new QName("http://soapws/", "getAll");
    private final static QName _GetAllResponse_QNAME = new QName("http://soapws/", "getAllResponse");
    private final static QName _GetBestValSerie_QNAME = new QName("http://soapws/", "getBestValSerie");
    private final static QName _GetBestValSerieResponse_QNAME = new QName("http://soapws/", "getBestValSerieResponse");
    private final static QName _GetCategorias_QNAME = new QName("http://soapws/", "getCategorias");
    private final static QName _GetCategoriasResponse_QNAME = new QName("http://soapws/", "getCategoriasResponse");
    private final static QName _Remove_QNAME = new QName("http://soapws/", "remove");
    private final static QName _Serie_QNAME = new QName("http://soapws/", "serie");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soapws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Count }
     * 
     */
    public Count createCount() {
        return new Count();
    }

    /**
     * Create an instance of {@link CountResponse }
     * 
     */
    public CountResponse createCountResponse() {
        return new CountResponse();
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link Edit }
     * 
     */
    public Edit createEdit() {
        return new Edit();
    }

    /**
     * Create an instance of {@link Find }
     * 
     */
    public Find createFind() {
        return new Find();
    }

    /**
     * Create an instance of {@link FindAll }
     * 
     */
    public FindAll createFindAll() {
        return new FindAll();
    }

    /**
     * Create an instance of {@link FindAllResponse }
     * 
     */
    public FindAllResponse createFindAllResponse() {
        return new FindAllResponse();
    }

    /**
     * Create an instance of {@link FindConTitulo }
     * 
     */
    public FindConTitulo createFindConTitulo() {
        return new FindConTitulo();
    }

    /**
     * Create an instance of {@link FindConTituloResponse }
     * 
     */
    public FindConTituloResponse createFindConTituloResponse() {
        return new FindConTituloResponse();
    }

    /**
     * Create an instance of {@link FindRange }
     * 
     */
    public FindRange createFindRange() {
        return new FindRange();
    }

    /**
     * Create an instance of {@link FindRangeResponse }
     * 
     */
    public FindRangeResponse createFindRangeResponse() {
        return new FindRangeResponse();
    }

    /**
     * Create an instance of {@link FindResponse }
     * 
     */
    public FindResponse createFindResponse() {
        return new FindResponse();
    }

    /**
     * Create an instance of {@link GetAll }
     * 
     */
    public GetAll createGetAll() {
        return new GetAll();
    }

    /**
     * Create an instance of {@link GetAllResponse }
     * 
     */
    public GetAllResponse createGetAllResponse() {
        return new GetAllResponse();
    }

    /**
     * Create an instance of {@link GetBestValSerie }
     * 
     */
    public GetBestValSerie createGetBestValSerie() {
        return new GetBestValSerie();
    }

    /**
     * Create an instance of {@link GetBestValSerieResponse }
     * 
     */
    public GetBestValSerieResponse createGetBestValSerieResponse() {
        return new GetBestValSerieResponse();
    }

    /**
     * Create an instance of {@link GetCategorias }
     * 
     */
    public GetCategorias createGetCategorias() {
        return new GetCategorias();
    }

    /**
     * Create an instance of {@link GetCategoriasResponse }
     * 
     */
    public GetCategoriasResponse createGetCategoriasResponse() {
        return new GetCategoriasResponse();
    }

    /**
     * Create an instance of {@link Remove }
     * 
     */
    public Remove createRemove() {
        return new Remove();
    }

    /**
     * Create an instance of {@link Serie }
     * 
     */
    public Serie createSerie() {
        return new Serie();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Count }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapws/", name = "count")
    public JAXBElement<Count> createCount(Count value) {
        return new JAXBElement<Count>(_Count_QNAME, Count.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapws/", name = "countResponse")
    public JAXBElement<CountResponse> createCountResponse(CountResponse value) {
        return new JAXBElement<CountResponse>(_CountResponse_QNAME, CountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapws/", name = "create")
    public JAXBElement<Create> createCreate(Create value) {
        return new JAXBElement<Create>(_Create_QNAME, Create.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Edit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapws/", name = "edit")
    public JAXBElement<Edit> createEdit(Edit value) {
        return new JAXBElement<Edit>(_Edit_QNAME, Edit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Find }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapws/", name = "find")
    public JAXBElement<Find> createFind(Find value) {
        return new JAXBElement<Find>(_Find_QNAME, Find.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapws/", name = "findAll")
    public JAXBElement<FindAll> createFindAll(FindAll value) {
        return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapws/", name = "findAllResponse")
    public JAXBElement<FindAllResponse> createFindAllResponse(FindAllResponse value) {
        return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME, FindAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindConTitulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapws/", name = "findConTitulo")
    public JAXBElement<FindConTitulo> createFindConTitulo(FindConTitulo value) {
        return new JAXBElement<FindConTitulo>(_FindConTitulo_QNAME, FindConTitulo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindConTituloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapws/", name = "findConTituloResponse")
    public JAXBElement<FindConTituloResponse> createFindConTituloResponse(FindConTituloResponse value) {
        return new JAXBElement<FindConTituloResponse>(_FindConTituloResponse_QNAME, FindConTituloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapws/", name = "findRange")
    public JAXBElement<FindRange> createFindRange(FindRange value) {
        return new JAXBElement<FindRange>(_FindRange_QNAME, FindRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRangeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapws/", name = "findRangeResponse")
    public JAXBElement<FindRangeResponse> createFindRangeResponse(FindRangeResponse value) {
        return new JAXBElement<FindRangeResponse>(_FindRangeResponse_QNAME, FindRangeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapws/", name = "findResponse")
    public JAXBElement<FindResponse> createFindResponse(FindResponse value) {
        return new JAXBElement<FindResponse>(_FindResponse_QNAME, FindResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapws/", name = "getAll")
    public JAXBElement<GetAll> createGetAll(GetAll value) {
        return new JAXBElement<GetAll>(_GetAll_QNAME, GetAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapws/", name = "getAllResponse")
    public JAXBElement<GetAllResponse> createGetAllResponse(GetAllResponse value) {
        return new JAXBElement<GetAllResponse>(_GetAllResponse_QNAME, GetAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBestValSerie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapws/", name = "getBestValSerie")
    public JAXBElement<GetBestValSerie> createGetBestValSerie(GetBestValSerie value) {
        return new JAXBElement<GetBestValSerie>(_GetBestValSerie_QNAME, GetBestValSerie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBestValSerieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapws/", name = "getBestValSerieResponse")
    public JAXBElement<GetBestValSerieResponse> createGetBestValSerieResponse(GetBestValSerieResponse value) {
        return new JAXBElement<GetBestValSerieResponse>(_GetBestValSerieResponse_QNAME, GetBestValSerieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategorias }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapws/", name = "getCategorias")
    public JAXBElement<GetCategorias> createGetCategorias(GetCategorias value) {
        return new JAXBElement<GetCategorias>(_GetCategorias_QNAME, GetCategorias.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategoriasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapws/", name = "getCategoriasResponse")
    public JAXBElement<GetCategoriasResponse> createGetCategoriasResponse(GetCategoriasResponse value) {
        return new JAXBElement<GetCategoriasResponse>(_GetCategoriasResponse_QNAME, GetCategoriasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Remove }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapws/", name = "remove")
    public JAXBElement<Remove> createRemove(Remove value) {
        return new JAXBElement<Remove>(_Remove_QNAME, Remove.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Serie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapws/", name = "serie")
    public JAXBElement<Serie> createSerie(Serie value) {
        return new JAXBElement<Serie>(_Serie_QNAME, Serie.class, null, value);
    }

}
