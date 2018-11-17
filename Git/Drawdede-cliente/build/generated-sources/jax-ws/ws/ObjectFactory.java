
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _ParseException_QNAME = new QName("http://ws/", "ParseException");
    private final static QName _CreateEntrega_QNAME = new QName("http://ws/", "createEntrega");
    private final static QName _CreateHasEntrega_QNAME = new QName("http://ws/", "createHasEntrega");
    private final static QName _CreateSerie_QNAME = new QName("http://ws/", "createSerie");
    private final static QName _EditEntrega_QNAME = new QName("http://ws/", "editEntrega");
    private final static QName _EditHasEntrega_QNAME = new QName("http://ws/", "editHasEntrega");
    private final static QName _EditSerie_QNAME = new QName("http://ws/", "editSerie");
    private final static QName _Entrega_QNAME = new QName("http://ws/", "entrega");
    private final static QName _FiltrarEntregaPorPeriodoTiempo_QNAME = new QName("http://ws/", "filtrarEntregaPorPeriodoTiempo");
    private final static QName _FiltrarEntregaPorPeriodoTiempoResponse_QNAME = new QName("http://ws/", "filtrarEntregaPorPeriodoTiempoResponse");
    private final static QName _FiltroPorAnotacionEntrega_QNAME = new QName("http://ws/", "filtroPorAnotacionEntrega");
    private final static QName _FiltroPorAnotacionEntregaResponse_QNAME = new QName("http://ws/", "filtroPorAnotacionEntregaResponse");
    private final static QName _FindAllEntregas_QNAME = new QName("http://ws/", "findAllEntregas");
    private final static QName _FindAllEntregasResponse_QNAME = new QName("http://ws/", "findAllEntregasResponse");
    private final static QName _FindAllHasEntregas_QNAME = new QName("http://ws/", "findAllHasEntregas");
    private final static QName _FindAllHasEntregasResponse_QNAME = new QName("http://ws/", "findAllHasEntregasResponse");
    private final static QName _FindAllSeries_QNAME = new QName("http://ws/", "findAllSeries");
    private final static QName _FindAllSeriesResponse_QNAME = new QName("http://ws/", "findAllSeriesResponse");
    private final static QName _FindEntrega_QNAME = new QName("http://ws/", "findEntrega");
    private final static QName _FindEntregaResponse_QNAME = new QName("http://ws/", "findEntregaResponse");
    private final static QName _FindHasEntrega_QNAME = new QName("http://ws/", "findHasEntrega");
    private final static QName _FindHasEntregaResponse_QNAME = new QName("http://ws/", "findHasEntregaResponse");
    private final static QName _FindIdEntregaConTituloSerie_QNAME = new QName("http://ws/", "findIdEntregaConTituloSerie");
    private final static QName _FindIdEntregaConTituloSerieResponse_QNAME = new QName("http://ws/", "findIdEntregaConTituloSerieResponse");
    private final static QName _FindSerie_QNAME = new QName("http://ws/", "findSerie");
    private final static QName _FindSerieConTitulo_QNAME = new QName("http://ws/", "findSerieConTitulo");
    private final static QName _FindSerieConTituloResponse_QNAME = new QName("http://ws/", "findSerieConTituloResponse");
    private final static QName _FindSerieResponse_QNAME = new QName("http://ws/", "findSerieResponse");
    private final static QName _GetBestValSerie_QNAME = new QName("http://ws/", "getBestValSerie");
    private final static QName _GetBestValSerieResponse_QNAME = new QName("http://ws/", "getBestValSerieResponse");
    private final static QName _GetCategoriasSerie_QNAME = new QName("http://ws/", "getCategoriasSerie");
    private final static QName _GetCategoriasSerieResponse_QNAME = new QName("http://ws/", "getCategoriasSerieResponse");
    private final static QName _GetFechaEntregaNotNull_QNAME = new QName("http://ws/", "getFechaEntregaNotNull");
    private final static QName _GetFechaEntregaNotNullResponse_QNAME = new QName("http://ws/", "getFechaEntregaNotNullResponse");
    private final static QName _GetHulksEntregas_QNAME = new QName("http://ws/", "getHulksEntregas");
    private final static QName _GetHulksEntregasResponse_QNAME = new QName("http://ws/", "getHulksEntregasResponse");
    private final static QName _GetWorstValSerie_QNAME = new QName("http://ws/", "getWorstValSerie");
    private final static QName _GetWorstValSerieResponse_QNAME = new QName("http://ws/", "getWorstValSerieResponse");
    private final static QName _HasEntrega_QNAME = new QName("http://ws/", "hasEntrega");
    private final static QName _RemoveEntrega_QNAME = new QName("http://ws/", "removeEntrega");
    private final static QName _RemoveHasEntrega_QNAME = new QName("http://ws/", "removeHasEntrega");
    private final static QName _RemoveSerie_QNAME = new QName("http://ws/", "removeSerie");
    private final static QName _Serie_QNAME = new QName("http://ws/", "serie");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
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
     * Create an instance of {@link CreateEntrega }
     * 
     */
    public CreateEntrega createCreateEntrega() {
        return new CreateEntrega();
    }

    /**
     * Create an instance of {@link CreateHasEntrega }
     * 
     */
    public CreateHasEntrega createCreateHasEntrega() {
        return new CreateHasEntrega();
    }

    /**
     * Create an instance of {@link CreateSerie }
     * 
     */
    public CreateSerie createCreateSerie() {
        return new CreateSerie();
    }

    /**
     * Create an instance of {@link EditEntrega }
     * 
     */
    public EditEntrega createEditEntrega() {
        return new EditEntrega();
    }

    /**
     * Create an instance of {@link EditHasEntrega }
     * 
     */
    public EditHasEntrega createEditHasEntrega() {
        return new EditHasEntrega();
    }

    /**
     * Create an instance of {@link EditSerie }
     * 
     */
    public EditSerie createEditSerie() {
        return new EditSerie();
    }

    /**
     * Create an instance of {@link Entrega }
     * 
     */
    public Entrega createEntrega() {
        return new Entrega();
    }

    /**
     * Create an instance of {@link FiltrarEntregaPorPeriodoTiempo }
     * 
     */
    public FiltrarEntregaPorPeriodoTiempo createFiltrarEntregaPorPeriodoTiempo() {
        return new FiltrarEntregaPorPeriodoTiempo();
    }

    /**
     * Create an instance of {@link FiltrarEntregaPorPeriodoTiempoResponse }
     * 
     */
    public FiltrarEntregaPorPeriodoTiempoResponse createFiltrarEntregaPorPeriodoTiempoResponse() {
        return new FiltrarEntregaPorPeriodoTiempoResponse();
    }

    /**
     * Create an instance of {@link FiltroPorAnotacionEntrega }
     * 
     */
    public FiltroPorAnotacionEntrega createFiltroPorAnotacionEntrega() {
        return new FiltroPorAnotacionEntrega();
    }

    /**
     * Create an instance of {@link FiltroPorAnotacionEntregaResponse }
     * 
     */
    public FiltroPorAnotacionEntregaResponse createFiltroPorAnotacionEntregaResponse() {
        return new FiltroPorAnotacionEntregaResponse();
    }

    /**
     * Create an instance of {@link FindAllEntregas }
     * 
     */
    public FindAllEntregas createFindAllEntregas() {
        return new FindAllEntregas();
    }

    /**
     * Create an instance of {@link FindAllEntregasResponse }
     * 
     */
    public FindAllEntregasResponse createFindAllEntregasResponse() {
        return new FindAllEntregasResponse();
    }

    /**
     * Create an instance of {@link FindAllHasEntregas }
     * 
     */
    public FindAllHasEntregas createFindAllHasEntregas() {
        return new FindAllHasEntregas();
    }

    /**
     * Create an instance of {@link FindAllHasEntregasResponse }
     * 
     */
    public FindAllHasEntregasResponse createFindAllHasEntregasResponse() {
        return new FindAllHasEntregasResponse();
    }

    /**
     * Create an instance of {@link FindAllSeries }
     * 
     */
    public FindAllSeries createFindAllSeries() {
        return new FindAllSeries();
    }

    /**
     * Create an instance of {@link FindAllSeriesResponse }
     * 
     */
    public FindAllSeriesResponse createFindAllSeriesResponse() {
        return new FindAllSeriesResponse();
    }

    /**
     * Create an instance of {@link FindEntrega }
     * 
     */
    public FindEntrega createFindEntrega() {
        return new FindEntrega();
    }

    /**
     * Create an instance of {@link FindEntregaResponse }
     * 
     */
    public FindEntregaResponse createFindEntregaResponse() {
        return new FindEntregaResponse();
    }

    /**
     * Create an instance of {@link FindHasEntrega }
     * 
     */
    public FindHasEntrega createFindHasEntrega() {
        return new FindHasEntrega();
    }

    /**
     * Create an instance of {@link FindHasEntregaResponse }
     * 
     */
    public FindHasEntregaResponse createFindHasEntregaResponse() {
        return new FindHasEntregaResponse();
    }

    /**
     * Create an instance of {@link FindIdEntregaConTituloSerie }
     * 
     */
    public FindIdEntregaConTituloSerie createFindIdEntregaConTituloSerie() {
        return new FindIdEntregaConTituloSerie();
    }

    /**
     * Create an instance of {@link FindIdEntregaConTituloSerieResponse }
     * 
     */
    public FindIdEntregaConTituloSerieResponse createFindIdEntregaConTituloSerieResponse() {
        return new FindIdEntregaConTituloSerieResponse();
    }

    /**
     * Create an instance of {@link FindSerie }
     * 
     */
    public FindSerie createFindSerie() {
        return new FindSerie();
    }

    /**
     * Create an instance of {@link FindSerieConTitulo }
     * 
     */
    public FindSerieConTitulo createFindSerieConTitulo() {
        return new FindSerieConTitulo();
    }

    /**
     * Create an instance of {@link FindSerieConTituloResponse }
     * 
     */
    public FindSerieConTituloResponse createFindSerieConTituloResponse() {
        return new FindSerieConTituloResponse();
    }

    /**
     * Create an instance of {@link FindSerieResponse }
     * 
     */
    public FindSerieResponse createFindSerieResponse() {
        return new FindSerieResponse();
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
     * Create an instance of {@link GetCategoriasSerie }
     * 
     */
    public GetCategoriasSerie createGetCategoriasSerie() {
        return new GetCategoriasSerie();
    }

    /**
     * Create an instance of {@link GetCategoriasSerieResponse }
     * 
     */
    public GetCategoriasSerieResponse createGetCategoriasSerieResponse() {
        return new GetCategoriasSerieResponse();
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
     * Create an instance of {@link GetHulksEntregas }
     * 
     */
    public GetHulksEntregas createGetHulksEntregas() {
        return new GetHulksEntregas();
    }

    /**
     * Create an instance of {@link GetHulksEntregasResponse }
     * 
     */
    public GetHulksEntregasResponse createGetHulksEntregasResponse() {
        return new GetHulksEntregasResponse();
    }

    /**
     * Create an instance of {@link GetWorstValSerie }
     * 
     */
    public GetWorstValSerie createGetWorstValSerie() {
        return new GetWorstValSerie();
    }

    /**
     * Create an instance of {@link GetWorstValSerieResponse }
     * 
     */
    public GetWorstValSerieResponse createGetWorstValSerieResponse() {
        return new GetWorstValSerieResponse();
    }

    /**
     * Create an instance of {@link HasEntrega }
     * 
     */
    public HasEntrega createHasEntrega() {
        return new HasEntrega();
    }

    /**
     * Create an instance of {@link RemoveEntrega }
     * 
     */
    public RemoveEntrega createRemoveEntrega() {
        return new RemoveEntrega();
    }

    /**
     * Create an instance of {@link RemoveHasEntrega }
     * 
     */
    public RemoveHasEntrega createRemoveHasEntrega() {
        return new RemoveHasEntrega();
    }

    /**
     * Create an instance of {@link RemoveSerie }
     * 
     */
    public RemoveSerie createRemoveSerie() {
        return new RemoveSerie();
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
    @XmlElementDecl(namespace = "http://ws/", name = "ParseException")
    public JAXBElement<ParseException> createParseException(ParseException value) {
        return new JAXBElement<ParseException>(_ParseException_QNAME, ParseException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEntrega }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "createEntrega")
    public JAXBElement<CreateEntrega> createCreateEntrega(CreateEntrega value) {
        return new JAXBElement<CreateEntrega>(_CreateEntrega_QNAME, CreateEntrega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateHasEntrega }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "createHasEntrega")
    public JAXBElement<CreateHasEntrega> createCreateHasEntrega(CreateHasEntrega value) {
        return new JAXBElement<CreateHasEntrega>(_CreateHasEntrega_QNAME, CreateHasEntrega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSerie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "createSerie")
    public JAXBElement<CreateSerie> createCreateSerie(CreateSerie value) {
        return new JAXBElement<CreateSerie>(_CreateSerie_QNAME, CreateSerie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditEntrega }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "editEntrega")
    public JAXBElement<EditEntrega> createEditEntrega(EditEntrega value) {
        return new JAXBElement<EditEntrega>(_EditEntrega_QNAME, EditEntrega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditHasEntrega }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "editHasEntrega")
    public JAXBElement<EditHasEntrega> createEditHasEntrega(EditHasEntrega value) {
        return new JAXBElement<EditHasEntrega>(_EditHasEntrega_QNAME, EditHasEntrega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditSerie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "editSerie")
    public JAXBElement<EditSerie> createEditSerie(EditSerie value) {
        return new JAXBElement<EditSerie>(_EditSerie_QNAME, EditSerie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entrega }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "entrega")
    public JAXBElement<Entrega> createEntrega(Entrega value) {
        return new JAXBElement<Entrega>(_Entrega_QNAME, Entrega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FiltrarEntregaPorPeriodoTiempo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "filtrarEntregaPorPeriodoTiempo")
    public JAXBElement<FiltrarEntregaPorPeriodoTiempo> createFiltrarEntregaPorPeriodoTiempo(FiltrarEntregaPorPeriodoTiempo value) {
        return new JAXBElement<FiltrarEntregaPorPeriodoTiempo>(_FiltrarEntregaPorPeriodoTiempo_QNAME, FiltrarEntregaPorPeriodoTiempo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FiltrarEntregaPorPeriodoTiempoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "filtrarEntregaPorPeriodoTiempoResponse")
    public JAXBElement<FiltrarEntregaPorPeriodoTiempoResponse> createFiltrarEntregaPorPeriodoTiempoResponse(FiltrarEntregaPorPeriodoTiempoResponse value) {
        return new JAXBElement<FiltrarEntregaPorPeriodoTiempoResponse>(_FiltrarEntregaPorPeriodoTiempoResponse_QNAME, FiltrarEntregaPorPeriodoTiempoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FiltroPorAnotacionEntrega }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "filtroPorAnotacionEntrega")
    public JAXBElement<FiltroPorAnotacionEntrega> createFiltroPorAnotacionEntrega(FiltroPorAnotacionEntrega value) {
        return new JAXBElement<FiltroPorAnotacionEntrega>(_FiltroPorAnotacionEntrega_QNAME, FiltroPorAnotacionEntrega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FiltroPorAnotacionEntregaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "filtroPorAnotacionEntregaResponse")
    public JAXBElement<FiltroPorAnotacionEntregaResponse> createFiltroPorAnotacionEntregaResponse(FiltroPorAnotacionEntregaResponse value) {
        return new JAXBElement<FiltroPorAnotacionEntregaResponse>(_FiltroPorAnotacionEntregaResponse_QNAME, FiltroPorAnotacionEntregaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllEntregas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findAllEntregas")
    public JAXBElement<FindAllEntregas> createFindAllEntregas(FindAllEntregas value) {
        return new JAXBElement<FindAllEntregas>(_FindAllEntregas_QNAME, FindAllEntregas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllEntregasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findAllEntregasResponse")
    public JAXBElement<FindAllEntregasResponse> createFindAllEntregasResponse(FindAllEntregasResponse value) {
        return new JAXBElement<FindAllEntregasResponse>(_FindAllEntregasResponse_QNAME, FindAllEntregasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllHasEntregas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findAllHasEntregas")
    public JAXBElement<FindAllHasEntregas> createFindAllHasEntregas(FindAllHasEntregas value) {
        return new JAXBElement<FindAllHasEntregas>(_FindAllHasEntregas_QNAME, FindAllHasEntregas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllHasEntregasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findAllHasEntregasResponse")
    public JAXBElement<FindAllHasEntregasResponse> createFindAllHasEntregasResponse(FindAllHasEntregasResponse value) {
        return new JAXBElement<FindAllHasEntregasResponse>(_FindAllHasEntregasResponse_QNAME, FindAllHasEntregasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllSeries }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findAllSeries")
    public JAXBElement<FindAllSeries> createFindAllSeries(FindAllSeries value) {
        return new JAXBElement<FindAllSeries>(_FindAllSeries_QNAME, FindAllSeries.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllSeriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findAllSeriesResponse")
    public JAXBElement<FindAllSeriesResponse> createFindAllSeriesResponse(FindAllSeriesResponse value) {
        return new JAXBElement<FindAllSeriesResponse>(_FindAllSeriesResponse_QNAME, FindAllSeriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEntrega }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findEntrega")
    public JAXBElement<FindEntrega> createFindEntrega(FindEntrega value) {
        return new JAXBElement<FindEntrega>(_FindEntrega_QNAME, FindEntrega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEntregaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findEntregaResponse")
    public JAXBElement<FindEntregaResponse> createFindEntregaResponse(FindEntregaResponse value) {
        return new JAXBElement<FindEntregaResponse>(_FindEntregaResponse_QNAME, FindEntregaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindHasEntrega }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findHasEntrega")
    public JAXBElement<FindHasEntrega> createFindHasEntrega(FindHasEntrega value) {
        return new JAXBElement<FindHasEntrega>(_FindHasEntrega_QNAME, FindHasEntrega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindHasEntregaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findHasEntregaResponse")
    public JAXBElement<FindHasEntregaResponse> createFindHasEntregaResponse(FindHasEntregaResponse value) {
        return new JAXBElement<FindHasEntregaResponse>(_FindHasEntregaResponse_QNAME, FindHasEntregaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindIdEntregaConTituloSerie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findIdEntregaConTituloSerie")
    public JAXBElement<FindIdEntregaConTituloSerie> createFindIdEntregaConTituloSerie(FindIdEntregaConTituloSerie value) {
        return new JAXBElement<FindIdEntregaConTituloSerie>(_FindIdEntregaConTituloSerie_QNAME, FindIdEntregaConTituloSerie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindIdEntregaConTituloSerieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findIdEntregaConTituloSerieResponse")
    public JAXBElement<FindIdEntregaConTituloSerieResponse> createFindIdEntregaConTituloSerieResponse(FindIdEntregaConTituloSerieResponse value) {
        return new JAXBElement<FindIdEntregaConTituloSerieResponse>(_FindIdEntregaConTituloSerieResponse_QNAME, FindIdEntregaConTituloSerieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindSerie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findSerie")
    public JAXBElement<FindSerie> createFindSerie(FindSerie value) {
        return new JAXBElement<FindSerie>(_FindSerie_QNAME, FindSerie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindSerieConTitulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findSerieConTitulo")
    public JAXBElement<FindSerieConTitulo> createFindSerieConTitulo(FindSerieConTitulo value) {
        return new JAXBElement<FindSerieConTitulo>(_FindSerieConTitulo_QNAME, FindSerieConTitulo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindSerieConTituloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findSerieConTituloResponse")
    public JAXBElement<FindSerieConTituloResponse> createFindSerieConTituloResponse(FindSerieConTituloResponse value) {
        return new JAXBElement<FindSerieConTituloResponse>(_FindSerieConTituloResponse_QNAME, FindSerieConTituloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindSerieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findSerieResponse")
    public JAXBElement<FindSerieResponse> createFindSerieResponse(FindSerieResponse value) {
        return new JAXBElement<FindSerieResponse>(_FindSerieResponse_QNAME, FindSerieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBestValSerie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getBestValSerie")
    public JAXBElement<GetBestValSerie> createGetBestValSerie(GetBestValSerie value) {
        return new JAXBElement<GetBestValSerie>(_GetBestValSerie_QNAME, GetBestValSerie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBestValSerieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getBestValSerieResponse")
    public JAXBElement<GetBestValSerieResponse> createGetBestValSerieResponse(GetBestValSerieResponse value) {
        return new JAXBElement<GetBestValSerieResponse>(_GetBestValSerieResponse_QNAME, GetBestValSerieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategoriasSerie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCategoriasSerie")
    public JAXBElement<GetCategoriasSerie> createGetCategoriasSerie(GetCategoriasSerie value) {
        return new JAXBElement<GetCategoriasSerie>(_GetCategoriasSerie_QNAME, GetCategoriasSerie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategoriasSerieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCategoriasSerieResponse")
    public JAXBElement<GetCategoriasSerieResponse> createGetCategoriasSerieResponse(GetCategoriasSerieResponse value) {
        return new JAXBElement<GetCategoriasSerieResponse>(_GetCategoriasSerieResponse_QNAME, GetCategoriasSerieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFechaEntregaNotNull }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getFechaEntregaNotNull")
    public JAXBElement<GetFechaEntregaNotNull> createGetFechaEntregaNotNull(GetFechaEntregaNotNull value) {
        return new JAXBElement<GetFechaEntregaNotNull>(_GetFechaEntregaNotNull_QNAME, GetFechaEntregaNotNull.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFechaEntregaNotNullResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getFechaEntregaNotNullResponse")
    public JAXBElement<GetFechaEntregaNotNullResponse> createGetFechaEntregaNotNullResponse(GetFechaEntregaNotNullResponse value) {
        return new JAXBElement<GetFechaEntregaNotNullResponse>(_GetFechaEntregaNotNullResponse_QNAME, GetFechaEntregaNotNullResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHulksEntregas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getHulksEntregas")
    public JAXBElement<GetHulksEntregas> createGetHulksEntregas(GetHulksEntregas value) {
        return new JAXBElement<GetHulksEntregas>(_GetHulksEntregas_QNAME, GetHulksEntregas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHulksEntregasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getHulksEntregasResponse")
    public JAXBElement<GetHulksEntregasResponse> createGetHulksEntregasResponse(GetHulksEntregasResponse value) {
        return new JAXBElement<GetHulksEntregasResponse>(_GetHulksEntregasResponse_QNAME, GetHulksEntregasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorstValSerie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getWorstValSerie")
    public JAXBElement<GetWorstValSerie> createGetWorstValSerie(GetWorstValSerie value) {
        return new JAXBElement<GetWorstValSerie>(_GetWorstValSerie_QNAME, GetWorstValSerie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorstValSerieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getWorstValSerieResponse")
    public JAXBElement<GetWorstValSerieResponse> createGetWorstValSerieResponse(GetWorstValSerieResponse value) {
        return new JAXBElement<GetWorstValSerieResponse>(_GetWorstValSerieResponse_QNAME, GetWorstValSerieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HasEntrega }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "hasEntrega")
    public JAXBElement<HasEntrega> createHasEntrega(HasEntrega value) {
        return new JAXBElement<HasEntrega>(_HasEntrega_QNAME, HasEntrega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveEntrega }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "removeEntrega")
    public JAXBElement<RemoveEntrega> createRemoveEntrega(RemoveEntrega value) {
        return new JAXBElement<RemoveEntrega>(_RemoveEntrega_QNAME, RemoveEntrega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveHasEntrega }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "removeHasEntrega")
    public JAXBElement<RemoveHasEntrega> createRemoveHasEntrega(RemoveHasEntrega value) {
        return new JAXBElement<RemoveHasEntrega>(_RemoveHasEntrega_QNAME, RemoveHasEntrega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveSerie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "removeSerie")
    public JAXBElement<RemoveSerie> createRemoveSerie(RemoveSerie value) {
        return new JAXBElement<RemoveSerie>(_RemoveSerie_QNAME, RemoveSerie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Serie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "serie")
    public JAXBElement<Serie> createSerie(Serie value) {
        return new JAXBElement<Serie>(_Serie_QNAME, Serie.class, null, value);
    }

}
