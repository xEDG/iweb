
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

    private final static QName _ParseException_QNAME = new QName("http://soapws/", "ParseException");
    private final static QName _Count_QNAME = new QName("http://soapws/", "count");
    private final static QName _CountResponse_QNAME = new QName("http://soapws/", "countResponse");
    private final static QName _Create_QNAME = new QName("http://soapws/", "create");
    private final static QName _Edit_QNAME = new QName("http://soapws/", "edit");
    private final static QName _Entrega_QNAME = new QName("http://soapws/", "entrega");
    private final static QName _FiltrarPorPeriodoTiempo_QNAME = new QName("http://soapws/", "filtrarPorPeriodoTiempo");
    private final static QName _FiltrarPorPeriodoTiempoResponse_QNAME = new QName("http://soapws/", "filtrarPorPeriodoTiempoResponse");
    private final static QName _FiltroPorAnotacion_QNAME = new QName("http://soapws/", "filtroPorAnotacion");
    private final static QName _FiltroPorAnotacionResponse_QNAME = new QName("http://soapws/", "filtroPorAnotacionResponse");
    private final static QName _Find_QNAME = new QName("http://soapws/", "find");
    private final static QName _FindAll_QNAME = new QName("http://soapws/", "findAll");
    private final static QName _FindAllResponse_QNAME = new QName("http://soapws/", "findAllResponse");
    private final static QName _FindRange_QNAME = new QName("http://soapws/", "findRange");
    private final static QName _FindRangeResponse_QNAME = new QName("http://soapws/", "findRangeResponse");
    private final static QName _FindResponse_QNAME = new QName("http://soapws/", "findResponse");
    private final static QName _GetFechaEntregaNotNull_QNAME = new QName("http://soapws/", "getFechaEntregaNotNull");
    private final static QName _GetFechaEntregaNotNullResponse_QNAME = new QName("http://soapws/", "getFechaEntregaNotNullResponse");
    private final static QName _GetHulks_QNAME = new QName("http://soapws/", "getHulks");
    private final static QName _GetHulksResponse_QNAME = new QName("http://soapws/", "getHulksResponse");
    private final static QName _Remove_QNAME = new QName("http://soapws/", "remove");
    private final static QName _Serie_QNAME = new QName("http://soapws/", "serie");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soapws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ParseException }
     * 
     */
    public ParseException createParseException() {
        return new ParseException();
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
     * Create an instance of {@link Entrega }
     * 
     */
    public Entrega createEntrega() {
        return new Entrega();
    }

    /**
     * Create an instance of {@link FiltrarPorPeriodoTiempo }
     * 
     */
    public FiltrarPorPeriodoTiempo createFiltrarPorPeriodoTiempo() {
        return new FiltrarPorPeriodoTiempo();
    }

    /**
     * Create an instance of {@link FiltrarPorPeriodoTiempoResponse }
     * 
     */
    public FiltrarPorPeriodoTiempoResponse createFiltrarPorPeriodoTiempoResponse() {
        return new FiltrarPorPeriodoTiempoResponse();
    }

    /**
     * Create an instance of {@link FiltroPorAnotacion }
     * 
     */
    public FiltroPorAnotacion createFiltroPorAnotacion() {
        return new FiltroPorAnotacion();
    }

    /**
     * Create an instance of {@link FiltroPorAnotacionResponse }
     * 
     */
    public FiltroPorAnotacionResponse createFiltroPorAnotacionResponse() {
        return new FiltroPorAnotacionResponse();
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
     * Create an instance of {@link GetFechaEntregaNotNull }
     * 
     */
    public GetFechaEntregaNotNull createGetFechaEntregaNotNull() {
        return new GetFechaEntregaNotNull();
    }

    /**
     * Create an instance of {@link GetFechaEntregaNotNullResponse }
     * 
     */
    public GetFechaEntregaNotNullResponse createGetFechaEntregaNotNullResponse() {
        return new GetFechaEntregaNotNullResponse();
    }

    /**
     * Create an instance of {@link GetHulks }
     * 
     */
    public GetHulks createGetHulks() {
        return new GetHulks();
    }

    /**
     * Create an instance of {@link GetHulksResponse }
     * 
     */
    public GetHulksResponse createGetHulksResponse() {
        return new GetHulksResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ParseException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapws/", name = "ParseException")
    public JAXBElement<ParseException> createParseException(ParseException value) {
        return new JAXBElement<ParseException>(_ParseException_QNAME, ParseException.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Entrega }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapws/", name = "entrega")
    public JAXBElement<Entrega> createEntrega(Entrega value) {
        return new JAXBElement<Entrega>(_Entrega_QNAME, Entrega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FiltrarPorPeriodoTiempo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapws/", name = "filtrarPorPeriodoTiempo")
    public JAXBElement<FiltrarPorPeriodoTiempo> createFiltrarPorPeriodoTiempo(FiltrarPorPeriodoTiempo value) {
        return new JAXBElement<FiltrarPorPeriodoTiempo>(_FiltrarPorPeriodoTiempo_QNAME, FiltrarPorPeriodoTiempo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FiltrarPorPeriodoTiempoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapws/", name = "filtrarPorPeriodoTiempoResponse")
    public JAXBElement<FiltrarPorPeriodoTiempoResponse> createFiltrarPorPeriodoTiempoResponse(FiltrarPorPeriodoTiempoResponse value) {
        return new JAXBElement<FiltrarPorPeriodoTiempoResponse>(_FiltrarPorPeriodoTiempoResponse_QNAME, FiltrarPorPeriodoTiempoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FiltroPorAnotacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapws/", name = "filtroPorAnotacion")
    public JAXBElement<FiltroPorAnotacion> createFiltroPorAnotacion(FiltroPorAnotacion value) {
        return new JAXBElement<FiltroPorAnotacion>(_FiltroPorAnotacion_QNAME, FiltroPorAnotacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FiltroPorAnotacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapws/", name = "filtroPorAnotacionResponse")
    public JAXBElement<FiltroPorAnotacionResponse> createFiltroPorAnotacionResponse(FiltroPorAnotacionResponse value) {
        return new JAXBElement<FiltroPorAnotacionResponse>(_FiltroPorAnotacionResponse_QNAME, FiltroPorAnotacionResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFechaEntregaNotNull }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapws/", name = "getFechaEntregaNotNull")
    public JAXBElement<GetFechaEntregaNotNull> createGetFechaEntregaNotNull(GetFechaEntregaNotNull value) {
        return new JAXBElement<GetFechaEntregaNotNull>(_GetFechaEntregaNotNull_QNAME, GetFechaEntregaNotNull.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFechaEntregaNotNullResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapws/", name = "getFechaEntregaNotNullResponse")
    public JAXBElement<GetFechaEntregaNotNullResponse> createGetFechaEntregaNotNullResponse(GetFechaEntregaNotNullResponse value) {
        return new JAXBElement<GetFechaEntregaNotNullResponse>(_GetFechaEntregaNotNullResponse_QNAME, GetFechaEntregaNotNullResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHulks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapws/", name = "getHulks")
    public JAXBElement<GetHulks> createGetHulks(GetHulks value) {
        return new JAXBElement<GetHulks>(_GetHulks_QNAME, GetHulks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHulksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapws/", name = "getHulksResponse")
    public JAXBElement<GetHulksResponse> createGetHulksResponse(GetHulksResponse value) {
        return new JAXBElement<GetHulksResponse>(_GetHulksResponse_QNAME, GetHulksResponse.class, null, value);
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
