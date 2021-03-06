
package ssn.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ssn.ws package. 
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

    private final static QName _UpdateField_QNAME = new QName("http://ws.ssn/", "updateField");
    private final static QName _GetFieldById_QNAME = new QName("http://ws.ssn/", "getFieldById");
    private final static QName _RegisterUserResponse_QNAME = new QName("http://ws.ssn/", "registerUserResponse");
    private final static QName _DeleteReservationsResponse_QNAME = new QName("http://ws.ssn/", "deleteReservationsResponse");
    private final static QName _GetSportByIdResponse_QNAME = new QName("http://ws.ssn/", "getSportByIdResponse");
    private final static QName _JoinEvent_QNAME = new QName("http://ws.ssn/", "joinEvent");
    private final static QName _LeaveEventResponse_QNAME = new QName("http://ws.ssn/", "leaveEventResponse");
    private final static QName _GetEventsByFilters_QNAME = new QName("http://ws.ssn/", "getEventsByFilters");
    private final static QName _UpdateFieldSport_QNAME = new QName("http://ws.ssn/", "updateFieldSport");
    private final static QName _CreateReportType_QNAME = new QName("http://ws.ssn/", "createReportType");
    private final static QName _DeleteReservation_QNAME = new QName("http://ws.ssn/", "deleteReservation");
    private final static QName _AddFieldSport_QNAME = new QName("http://ws.ssn/", "addFieldSport");
    private final static QName _GetEventsByUser_QNAME = new QName("http://ws.ssn/", "getEventsByUser");
    private final static QName _DeleteManagerEntityResponse_QNAME = new QName("http://ws.ssn/", "deleteManagerEntityResponse");
    private final static QName _DeleteFieldSportResponse_QNAME = new QName("http://ws.ssn/", "deleteFieldSportResponse");
    private final static QName _GetManagerEntitiesByIdResponse_QNAME = new QName("http://ws.ssn/", "getManagerEntitiesByIdResponse");
    private final static QName _GetManagerEntitiesById_QNAME = new QName("http://ws.ssn/", "getManagerEntitiesById");
    private final static QName _ReportUserResponse_QNAME = new QName("http://ws.ssn/", "reportUserResponse");
    private final static QName _GetManagerEntitiesResponse_QNAME = new QName("http://ws.ssn/", "getManagerEntitiesResponse");
    private final static QName _AddReservation_QNAME = new QName("http://ws.ssn/", "addReservation");
    private final static QName _UpdateUserResponse_QNAME = new QName("http://ws.ssn/", "updateUserResponse");
    private final static QName _GetEventsHistoryByUserResponse_QNAME = new QName("http://ws.ssn/", "getEventsHistoryByUserResponse");
    private final static QName _GetManagerEntitiesBySport_QNAME = new QName("http://ws.ssn/", "getManagerEntitiesBySport");
    private final static QName _GetManagerEntities_QNAME = new QName("http://ws.ssn/", "getManagerEntities");
    private final static QName _CreateManagerEntity_QNAME = new QName("http://ws.ssn/", "createManagerEntity");
    private final static QName _AddField_QNAME = new QName("http://ws.ssn/", "addField");
    private final static QName _CreateSport_QNAME = new QName("http://ws.ssn/", "createSport");
    private final static QName _GetEventsByFiltersResponse_QNAME = new QName("http://ws.ssn/", "getEventsByFiltersResponse");
    private final static QName _GetManagerEntitiesByEventResponse_QNAME = new QName("http://ws.ssn/", "getManagerEntitiesByEventResponse");
    private final static QName _GetManagerEntitiesBySportResponse_QNAME = new QName("http://ws.ssn/", "getManagerEntitiesBySportResponse");
    private final static QName _AddReservationsResponse_QNAME = new QName("http://ws.ssn/", "addReservationsResponse");
    private final static QName _UpdateManagerEntity_QNAME = new QName("http://ws.ssn/", "updateManagerEntity");
    private final static QName _DeleteManagerEntity_QNAME = new QName("http://ws.ssn/", "deleteManagerEntity");
    private final static QName _GetEventByIdResponse_QNAME = new QName("http://ws.ssn/", "getEventByIdResponse");
    private final static QName _JoinEventResponse_QNAME = new QName("http://ws.ssn/", "joinEventResponse");
    private final static QName _RegisterUser_QNAME = new QName("http://ws.ssn/", "registerUser");
    private final static QName _UpdateManagerEntityResponse_QNAME = new QName("http://ws.ssn/", "updateManagerEntityResponse");
    private final static QName _GetUserDetailsResponse_QNAME = new QName("http://ws.ssn/", "getUserDetailsResponse");
    private final static QName _AddReservations_QNAME = new QName("http://ws.ssn/", "addReservations");
    private final static QName _DeleteFieldResponse_QNAME = new QName("http://ws.ssn/", "deleteFieldResponse");
    private final static QName _GetReservationsByFieldResponse_QNAME = new QName("http://ws.ssn/", "getReservationsByFieldResponse");
    private final static QName _AddFieldSportResponse_QNAME = new QName("http://ws.ssn/", "addFieldSportResponse");
    private final static QName _GetEventsResponse_QNAME = new QName("http://ws.ssn/", "getEventsResponse");
    private final static QName _DeleteFieldSport_QNAME = new QName("http://ws.ssn/", "deleteFieldSport");
    private final static QName _GetFieldByIdResponse_QNAME = new QName("http://ws.ssn/", "getFieldByIdResponse");
    private final static QName _GetFieldsByManagerEntity_QNAME = new QName("http://ws.ssn/", "getFieldsByManagerEntity");
    private final static QName _GetManagerEntitiesByEvent_QNAME = new QName("http://ws.ssn/", "getManagerEntitiesByEvent");
    private final static QName _GetSportsResponse_QNAME = new QName("http://ws.ssn/", "getSportsResponse");
    private final static QName _CreateManagerEntityResponse_QNAME = new QName("http://ws.ssn/", "createManagerEntityResponse");
    private final static QName _DeleteField_QNAME = new QName("http://ws.ssn/", "deleteField");
    private final static QName _GetReportTypesResponse_QNAME = new QName("http://ws.ssn/", "getReportTypesResponse");
    private final static QName _GetEventsHistoryByUser_QNAME = new QName("http://ws.ssn/", "getEventsHistoryByUser");
    private final static QName _GetUserDetails_QNAME = new QName("http://ws.ssn/", "getUserDetails");
    private final static QName _ReportUser_QNAME = new QName("http://ws.ssn/", "reportUser");
    private final static QName _CreateSportResponse_QNAME = new QName("http://ws.ssn/", "createSportResponse");
    private final static QName _GetReservationsByField_QNAME = new QName("http://ws.ssn/", "getReservationsByField");
    private final static QName _AddReservationResponse_QNAME = new QName("http://ws.ssn/", "addReservationResponse");
    private final static QName _GetSports_QNAME = new QName("http://ws.ssn/", "getSports");
    private final static QName _DeleteReservations_QNAME = new QName("http://ws.ssn/", "deleteReservations");
    private final static QName _LeaveEvent_QNAME = new QName("http://ws.ssn/", "leaveEvent");
    private final static QName _DeleteReservationResponse_QNAME = new QName("http://ws.ssn/", "deleteReservationResponse");
    private final static QName _AddFieldResponse_QNAME = new QName("http://ws.ssn/", "addFieldResponse");
    private final static QName _UpdateUser_QNAME = new QName("http://ws.ssn/", "updateUser");
    private final static QName _CreateReportTypeResponse_QNAME = new QName("http://ws.ssn/", "createReportTypeResponse");
    private final static QName _CreateEvent_QNAME = new QName("http://ws.ssn/", "createEvent");
    private final static QName _GetEvents_QNAME = new QName("http://ws.ssn/", "getEvents");
    private final static QName _GetReportTypes_QNAME = new QName("http://ws.ssn/", "getReportTypes");
    private final static QName _CreateEventResponse_QNAME = new QName("http://ws.ssn/", "createEventResponse");
    private final static QName _GetUsersByEventResponse_QNAME = new QName("http://ws.ssn/", "getUsersByEventResponse");
    private final static QName _GetEventById_QNAME = new QName("http://ws.ssn/", "getEventById");
    private final static QName _GetEventsByUserResponse_QNAME = new QName("http://ws.ssn/", "getEventsByUserResponse");
    private final static QName _UpdateFieldResponse_QNAME = new QName("http://ws.ssn/", "updateFieldResponse");
    private final static QName _UpdateFieldSportResponse_QNAME = new QName("http://ws.ssn/", "updateFieldSportResponse");
    private final static QName _GetUsersByEvent_QNAME = new QName("http://ws.ssn/", "getUsersByEvent");
    private final static QName _GetSportById_QNAME = new QName("http://ws.ssn/", "getSportById");
    private final static QName _GetFieldsByManagerEntityResponse_QNAME = new QName("http://ws.ssn/", "getFieldsByManagerEntityResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ssn.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteField }
     * 
     */
    public DeleteField createDeleteField() {
        return new DeleteField();
    }

    /**
     * Create an instance of {@link GetReportTypesResponse }
     * 
     */
    public GetReportTypesResponse createGetReportTypesResponse() {
        return new GetReportTypesResponse();
    }

    /**
     * Create an instance of {@link GetEventsHistoryByUser }
     * 
     */
    public GetEventsHistoryByUser createGetEventsHistoryByUser() {
        return new GetEventsHistoryByUser();
    }

    /**
     * Create an instance of {@link GetUserDetails }
     * 
     */
    public GetUserDetails createGetUserDetails() {
        return new GetUserDetails();
    }

    /**
     * Create an instance of {@link ReportUser }
     * 
     */
    public ReportUser createReportUser() {
        return new ReportUser();
    }

    /**
     * Create an instance of {@link CreateSportResponse }
     * 
     */
    public CreateSportResponse createCreateSportResponse() {
        return new CreateSportResponse();
    }

    /**
     * Create an instance of {@link AddFieldSportResponse }
     * 
     */
    public AddFieldSportResponse createAddFieldSportResponse() {
        return new AddFieldSportResponse();
    }

    /**
     * Create an instance of {@link GetEventsResponse }
     * 
     */
    public GetEventsResponse createGetEventsResponse() {
        return new GetEventsResponse();
    }

    /**
     * Create an instance of {@link DeleteFieldSport }
     * 
     */
    public DeleteFieldSport createDeleteFieldSport() {
        return new DeleteFieldSport();
    }

    /**
     * Create an instance of {@link GetFieldByIdResponse }
     * 
     */
    public GetFieldByIdResponse createGetFieldByIdResponse() {
        return new GetFieldByIdResponse();
    }

    /**
     * Create an instance of {@link GetFieldsByManagerEntity }
     * 
     */
    public GetFieldsByManagerEntity createGetFieldsByManagerEntity() {
        return new GetFieldsByManagerEntity();
    }

    /**
     * Create an instance of {@link GetSportsResponse }
     * 
     */
    public GetSportsResponse createGetSportsResponse() {
        return new GetSportsResponse();
    }

    /**
     * Create an instance of {@link GetManagerEntitiesByEvent }
     * 
     */
    public GetManagerEntitiesByEvent createGetManagerEntitiesByEvent() {
        return new GetManagerEntitiesByEvent();
    }

    /**
     * Create an instance of {@link CreateManagerEntityResponse }
     * 
     */
    public CreateManagerEntityResponse createCreateManagerEntityResponse() {
        return new CreateManagerEntityResponse();
    }

    /**
     * Create an instance of {@link GetReservationsByFieldResponse }
     * 
     */
    public GetReservationsByFieldResponse createGetReservationsByFieldResponse() {
        return new GetReservationsByFieldResponse();
    }

    /**
     * Create an instance of {@link DeleteFieldResponse }
     * 
     */
    public DeleteFieldResponse createDeleteFieldResponse() {
        return new DeleteFieldResponse();
    }

    /**
     * Create an instance of {@link AddReservations }
     * 
     */
    public AddReservations createAddReservations() {
        return new AddReservations();
    }

    /**
     * Create an instance of {@link GetUserDetailsResponse }
     * 
     */
    public GetUserDetailsResponse createGetUserDetailsResponse() {
        return new GetUserDetailsResponse();
    }

    /**
     * Create an instance of {@link GetUsersByEventResponse }
     * 
     */
    public GetUsersByEventResponse createGetUsersByEventResponse() {
        return new GetUsersByEventResponse();
    }

    /**
     * Create an instance of {@link GetEventById }
     * 
     */
    public GetEventById createGetEventById() {
        return new GetEventById();
    }

    /**
     * Create an instance of {@link UpdateFieldSportResponse }
     * 
     */
    public UpdateFieldSportResponse createUpdateFieldSportResponse() {
        return new UpdateFieldSportResponse();
    }

    /**
     * Create an instance of {@link UpdateFieldResponse }
     * 
     */
    public UpdateFieldResponse createUpdateFieldResponse() {
        return new UpdateFieldResponse();
    }

    /**
     * Create an instance of {@link GetEventsByUserResponse }
     * 
     */
    public GetEventsByUserResponse createGetEventsByUserResponse() {
        return new GetEventsByUserResponse();
    }

    /**
     * Create an instance of {@link GetUsersByEvent }
     * 
     */
    public GetUsersByEvent createGetUsersByEvent() {
        return new GetUsersByEvent();
    }

    /**
     * Create an instance of {@link GetSportById }
     * 
     */
    public GetSportById createGetSportById() {
        return new GetSportById();
    }

    /**
     * Create an instance of {@link GetFieldsByManagerEntityResponse }
     * 
     */
    public GetFieldsByManagerEntityResponse createGetFieldsByManagerEntityResponse() {
        return new GetFieldsByManagerEntityResponse();
    }

    /**
     * Create an instance of {@link GetReportTypes }
     * 
     */
    public GetReportTypes createGetReportTypes() {
        return new GetReportTypes();
    }

    /**
     * Create an instance of {@link CreateEventResponse }
     * 
     */
    public CreateEventResponse createCreateEventResponse() {
        return new CreateEventResponse();
    }

    /**
     * Create an instance of {@link CreateEvent }
     * 
     */
    public CreateEvent createCreateEvent() {
        return new CreateEvent();
    }

    /**
     * Create an instance of {@link GetEvents }
     * 
     */
    public GetEvents createGetEvents() {
        return new GetEvents();
    }

    /**
     * Create an instance of {@link GetReservationsByField }
     * 
     */
    public GetReservationsByField createGetReservationsByField() {
        return new GetReservationsByField();
    }

    /**
     * Create an instance of {@link AddReservationResponse }
     * 
     */
    public AddReservationResponse createAddReservationResponse() {
        return new AddReservationResponse();
    }

    /**
     * Create an instance of {@link GetSports }
     * 
     */
    public GetSports createGetSports() {
        return new GetSports();
    }

    /**
     * Create an instance of {@link DeleteReservations }
     * 
     */
    public DeleteReservations createDeleteReservations() {
        return new DeleteReservations();
    }

    /**
     * Create an instance of {@link LeaveEvent }
     * 
     */
    public LeaveEvent createLeaveEvent() {
        return new LeaveEvent();
    }

    /**
     * Create an instance of {@link DeleteReservationResponse }
     * 
     */
    public DeleteReservationResponse createDeleteReservationResponse() {
        return new DeleteReservationResponse();
    }

    /**
     * Create an instance of {@link AddFieldResponse }
     * 
     */
    public AddFieldResponse createAddFieldResponse() {
        return new AddFieldResponse();
    }

    /**
     * Create an instance of {@link UpdateUser }
     * 
     */
    public UpdateUser createUpdateUser() {
        return new UpdateUser();
    }

    /**
     * Create an instance of {@link CreateReportTypeResponse }
     * 
     */
    public CreateReportTypeResponse createCreateReportTypeResponse() {
        return new CreateReportTypeResponse();
    }

    /**
     * Create an instance of {@link GetEventsByUser }
     * 
     */
    public GetEventsByUser createGetEventsByUser() {
        return new GetEventsByUser();
    }

    /**
     * Create an instance of {@link DeleteManagerEntityResponse }
     * 
     */
    public DeleteManagerEntityResponse createDeleteManagerEntityResponse() {
        return new DeleteManagerEntityResponse();
    }

    /**
     * Create an instance of {@link DeleteFieldSportResponse }
     * 
     */
    public DeleteFieldSportResponse createDeleteFieldSportResponse() {
        return new DeleteFieldSportResponse();
    }

    /**
     * Create an instance of {@link GetManagerEntitiesByIdResponse }
     * 
     */
    public GetManagerEntitiesByIdResponse createGetManagerEntitiesByIdResponse() {
        return new GetManagerEntitiesByIdResponse();
    }

    /**
     * Create an instance of {@link CreateReportType }
     * 
     */
    public CreateReportType createCreateReportType() {
        return new CreateReportType();
    }

    /**
     * Create an instance of {@link DeleteReservation }
     * 
     */
    public DeleteReservation createDeleteReservation() {
        return new DeleteReservation();
    }

    /**
     * Create an instance of {@link AddFieldSport }
     * 
     */
    public AddFieldSport createAddFieldSport() {
        return new AddFieldSport();
    }

    /**
     * Create an instance of {@link GetSportByIdResponse }
     * 
     */
    public GetSportByIdResponse createGetSportByIdResponse() {
        return new GetSportByIdResponse();
    }

    /**
     * Create an instance of {@link LeaveEventResponse }
     * 
     */
    public LeaveEventResponse createLeaveEventResponse() {
        return new LeaveEventResponse();
    }

    /**
     * Create an instance of {@link JoinEvent }
     * 
     */
    public JoinEvent createJoinEvent() {
        return new JoinEvent();
    }

    /**
     * Create an instance of {@link GetEventsByFilters }
     * 
     */
    public GetEventsByFilters createGetEventsByFilters() {
        return new GetEventsByFilters();
    }

    /**
     * Create an instance of {@link UpdateFieldSport }
     * 
     */
    public UpdateFieldSport createUpdateFieldSport() {
        return new UpdateFieldSport();
    }

    /**
     * Create an instance of {@link UpdateField }
     * 
     */
    public UpdateField createUpdateField() {
        return new UpdateField();
    }

    /**
     * Create an instance of {@link GetFieldById }
     * 
     */
    public GetFieldById createGetFieldById() {
        return new GetFieldById();
    }

    /**
     * Create an instance of {@link RegisterUserResponse }
     * 
     */
    public RegisterUserResponse createRegisterUserResponse() {
        return new RegisterUserResponse();
    }

    /**
     * Create an instance of {@link DeleteReservationsResponse }
     * 
     */
    public DeleteReservationsResponse createDeleteReservationsResponse() {
        return new DeleteReservationsResponse();
    }

    /**
     * Create an instance of {@link GetManagerEntitiesByEventResponse }
     * 
     */
    public GetManagerEntitiesByEventResponse createGetManagerEntitiesByEventResponse() {
        return new GetManagerEntitiesByEventResponse();
    }

    /**
     * Create an instance of {@link GetManagerEntitiesBySportResponse }
     * 
     */
    public GetManagerEntitiesBySportResponse createGetManagerEntitiesBySportResponse() {
        return new GetManagerEntitiesBySportResponse();
    }

    /**
     * Create an instance of {@link AddReservationsResponse }
     * 
     */
    public AddReservationsResponse createAddReservationsResponse() {
        return new AddReservationsResponse();
    }

    /**
     * Create an instance of {@link UpdateManagerEntity }
     * 
     */
    public UpdateManagerEntity createUpdateManagerEntity() {
        return new UpdateManagerEntity();
    }

    /**
     * Create an instance of {@link DeleteManagerEntity }
     * 
     */
    public DeleteManagerEntity createDeleteManagerEntity() {
        return new DeleteManagerEntity();
    }

    /**
     * Create an instance of {@link JoinEventResponse }
     * 
     */
    public JoinEventResponse createJoinEventResponse() {
        return new JoinEventResponse();
    }

    /**
     * Create an instance of {@link GetEventByIdResponse }
     * 
     */
    public GetEventByIdResponse createGetEventByIdResponse() {
        return new GetEventByIdResponse();
    }

    /**
     * Create an instance of {@link RegisterUser }
     * 
     */
    public RegisterUser createRegisterUser() {
        return new RegisterUser();
    }

    /**
     * Create an instance of {@link UpdateManagerEntityResponse }
     * 
     */
    public UpdateManagerEntityResponse createUpdateManagerEntityResponse() {
        return new UpdateManagerEntityResponse();
    }

    /**
     * Create an instance of {@link CreateSport }
     * 
     */
    public CreateSport createCreateSport() {
        return new CreateSport();
    }

    /**
     * Create an instance of {@link AddField }
     * 
     */
    public AddField createAddField() {
        return new AddField();
    }

    /**
     * Create an instance of {@link GetEventsByFiltersResponse }
     * 
     */
    public GetEventsByFiltersResponse createGetEventsByFiltersResponse() {
        return new GetEventsByFiltersResponse();
    }

    /**
     * Create an instance of {@link UpdateUserResponse }
     * 
     */
    public UpdateUserResponse createUpdateUserResponse() {
        return new UpdateUserResponse();
    }

    /**
     * Create an instance of {@link AddReservation }
     * 
     */
    public AddReservation createAddReservation() {
        return new AddReservation();
    }

    /**
     * Create an instance of {@link GetEventsHistoryByUserResponse }
     * 
     */
    public GetEventsHistoryByUserResponse createGetEventsHistoryByUserResponse() {
        return new GetEventsHistoryByUserResponse();
    }

    /**
     * Create an instance of {@link GetManagerEntities }
     * 
     */
    public GetManagerEntities createGetManagerEntities() {
        return new GetManagerEntities();
    }

    /**
     * Create an instance of {@link GetManagerEntitiesBySport }
     * 
     */
    public GetManagerEntitiesBySport createGetManagerEntitiesBySport() {
        return new GetManagerEntitiesBySport();
    }

    /**
     * Create an instance of {@link CreateManagerEntity }
     * 
     */
    public CreateManagerEntity createCreateManagerEntity() {
        return new CreateManagerEntity();
    }

    /**
     * Create an instance of {@link GetManagerEntitiesById }
     * 
     */
    public GetManagerEntitiesById createGetManagerEntitiesById() {
        return new GetManagerEntitiesById();
    }

    /**
     * Create an instance of {@link ReportUserResponse }
     * 
     */
    public ReportUserResponse createReportUserResponse() {
        return new ReportUserResponse();
    }

    /**
     * Create an instance of {@link GetManagerEntitiesResponse }
     * 
     */
    public GetManagerEntitiesResponse createGetManagerEntitiesResponse() {
        return new GetManagerEntitiesResponse();
    }

    /**
     * Create an instance of {@link ReportType }
     * 
     */
    public ReportType createReportType() {
        return new ReportType();
    }

    /**
     * Create an instance of {@link Event }
     * 
     */
    public Event createEvent() {
        return new Event();
    }

    /**
     * Create an instance of {@link Report }
     * 
     */
    public Report createReport() {
        return new Report();
    }

    /**
     * Create an instance of {@link ManagerEntity }
     * 
     */
    public ManagerEntity createManagerEntity() {
        return new ManagerEntity();
    }

    /**
     * Create an instance of {@link Reservation }
     * 
     */
    public Reservation createReservation() {
        return new Reservation();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link Sport }
     * 
     */
    public Sport createSport() {
        return new Sport();
    }

    /**
     * Create an instance of {@link Field }
     * 
     */
    public Field createField() {
        return new Field();
    }

    /**
     * Create an instance of {@link FieldSports }
     * 
     */
    public FieldSports createFieldSports() {
        return new FieldSports();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "updateField")
    public JAXBElement<UpdateField> createUpdateField(UpdateField value) {
        return new JAXBElement<UpdateField>(_UpdateField_QNAME, UpdateField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFieldById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "getFieldById")
    public JAXBElement<GetFieldById> createGetFieldById(GetFieldById value) {
        return new JAXBElement<GetFieldById>(_GetFieldById_QNAME, GetFieldById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "registerUserResponse")
    public JAXBElement<RegisterUserResponse> createRegisterUserResponse(RegisterUserResponse value) {
        return new JAXBElement<RegisterUserResponse>(_RegisterUserResponse_QNAME, RegisterUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteReservationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "deleteReservationsResponse")
    public JAXBElement<DeleteReservationsResponse> createDeleteReservationsResponse(DeleteReservationsResponse value) {
        return new JAXBElement<DeleteReservationsResponse>(_DeleteReservationsResponse_QNAME, DeleteReservationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSportByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "getSportByIdResponse")
    public JAXBElement<GetSportByIdResponse> createGetSportByIdResponse(GetSportByIdResponse value) {
        return new JAXBElement<GetSportByIdResponse>(_GetSportByIdResponse_QNAME, GetSportByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JoinEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "joinEvent")
    public JAXBElement<JoinEvent> createJoinEvent(JoinEvent value) {
        return new JAXBElement<JoinEvent>(_JoinEvent_QNAME, JoinEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeaveEventResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "leaveEventResponse")
    public JAXBElement<LeaveEventResponse> createLeaveEventResponse(LeaveEventResponse value) {
        return new JAXBElement<LeaveEventResponse>(_LeaveEventResponse_QNAME, LeaveEventResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEventsByFilters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "getEventsByFilters")
    public JAXBElement<GetEventsByFilters> createGetEventsByFilters(GetEventsByFilters value) {
        return new JAXBElement<GetEventsByFilters>(_GetEventsByFilters_QNAME, GetEventsByFilters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateFieldSport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "updateFieldSport")
    public JAXBElement<UpdateFieldSport> createUpdateFieldSport(UpdateFieldSport value) {
        return new JAXBElement<UpdateFieldSport>(_UpdateFieldSport_QNAME, UpdateFieldSport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateReportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "createReportType")
    public JAXBElement<CreateReportType> createCreateReportType(CreateReportType value) {
        return new JAXBElement<CreateReportType>(_CreateReportType_QNAME, CreateReportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "deleteReservation")
    public JAXBElement<DeleteReservation> createDeleteReservation(DeleteReservation value) {
        return new JAXBElement<DeleteReservation>(_DeleteReservation_QNAME, DeleteReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddFieldSport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "addFieldSport")
    public JAXBElement<AddFieldSport> createAddFieldSport(AddFieldSport value) {
        return new JAXBElement<AddFieldSport>(_AddFieldSport_QNAME, AddFieldSport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEventsByUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "getEventsByUser")
    public JAXBElement<GetEventsByUser> createGetEventsByUser(GetEventsByUser value) {
        return new JAXBElement<GetEventsByUser>(_GetEventsByUser_QNAME, GetEventsByUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteManagerEntityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "deleteManagerEntityResponse")
    public JAXBElement<DeleteManagerEntityResponse> createDeleteManagerEntityResponse(DeleteManagerEntityResponse value) {
        return new JAXBElement<DeleteManagerEntityResponse>(_DeleteManagerEntityResponse_QNAME, DeleteManagerEntityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteFieldSportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "deleteFieldSportResponse")
    public JAXBElement<DeleteFieldSportResponse> createDeleteFieldSportResponse(DeleteFieldSportResponse value) {
        return new JAXBElement<DeleteFieldSportResponse>(_DeleteFieldSportResponse_QNAME, DeleteFieldSportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetManagerEntitiesByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "getManagerEntitiesByIdResponse")
    public JAXBElement<GetManagerEntitiesByIdResponse> createGetManagerEntitiesByIdResponse(GetManagerEntitiesByIdResponse value) {
        return new JAXBElement<GetManagerEntitiesByIdResponse>(_GetManagerEntitiesByIdResponse_QNAME, GetManagerEntitiesByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetManagerEntitiesById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "getManagerEntitiesById")
    public JAXBElement<GetManagerEntitiesById> createGetManagerEntitiesById(GetManagerEntitiesById value) {
        return new JAXBElement<GetManagerEntitiesById>(_GetManagerEntitiesById_QNAME, GetManagerEntitiesById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "reportUserResponse")
    public JAXBElement<ReportUserResponse> createReportUserResponse(ReportUserResponse value) {
        return new JAXBElement<ReportUserResponse>(_ReportUserResponse_QNAME, ReportUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetManagerEntitiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "getManagerEntitiesResponse")
    public JAXBElement<GetManagerEntitiesResponse> createGetManagerEntitiesResponse(GetManagerEntitiesResponse value) {
        return new JAXBElement<GetManagerEntitiesResponse>(_GetManagerEntitiesResponse_QNAME, GetManagerEntitiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "addReservation")
    public JAXBElement<AddReservation> createAddReservation(AddReservation value) {
        return new JAXBElement<AddReservation>(_AddReservation_QNAME, AddReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "updateUserResponse")
    public JAXBElement<UpdateUserResponse> createUpdateUserResponse(UpdateUserResponse value) {
        return new JAXBElement<UpdateUserResponse>(_UpdateUserResponse_QNAME, UpdateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEventsHistoryByUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "getEventsHistoryByUserResponse")
    public JAXBElement<GetEventsHistoryByUserResponse> createGetEventsHistoryByUserResponse(GetEventsHistoryByUserResponse value) {
        return new JAXBElement<GetEventsHistoryByUserResponse>(_GetEventsHistoryByUserResponse_QNAME, GetEventsHistoryByUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetManagerEntitiesBySport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "getManagerEntitiesBySport")
    public JAXBElement<GetManagerEntitiesBySport> createGetManagerEntitiesBySport(GetManagerEntitiesBySport value) {
        return new JAXBElement<GetManagerEntitiesBySport>(_GetManagerEntitiesBySport_QNAME, GetManagerEntitiesBySport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetManagerEntities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "getManagerEntities")
    public JAXBElement<GetManagerEntities> createGetManagerEntities(GetManagerEntities value) {
        return new JAXBElement<GetManagerEntities>(_GetManagerEntities_QNAME, GetManagerEntities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateManagerEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "createManagerEntity")
    public JAXBElement<CreateManagerEntity> createCreateManagerEntity(CreateManagerEntity value) {
        return new JAXBElement<CreateManagerEntity>(_CreateManagerEntity_QNAME, CreateManagerEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "addField")
    public JAXBElement<AddField> createAddField(AddField value) {
        return new JAXBElement<AddField>(_AddField_QNAME, AddField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "createSport")
    public JAXBElement<CreateSport> createCreateSport(CreateSport value) {
        return new JAXBElement<CreateSport>(_CreateSport_QNAME, CreateSport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEventsByFiltersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "getEventsByFiltersResponse")
    public JAXBElement<GetEventsByFiltersResponse> createGetEventsByFiltersResponse(GetEventsByFiltersResponse value) {
        return new JAXBElement<GetEventsByFiltersResponse>(_GetEventsByFiltersResponse_QNAME, GetEventsByFiltersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetManagerEntitiesByEventResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "getManagerEntitiesByEventResponse")
    public JAXBElement<GetManagerEntitiesByEventResponse> createGetManagerEntitiesByEventResponse(GetManagerEntitiesByEventResponse value) {
        return new JAXBElement<GetManagerEntitiesByEventResponse>(_GetManagerEntitiesByEventResponse_QNAME, GetManagerEntitiesByEventResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetManagerEntitiesBySportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "getManagerEntitiesBySportResponse")
    public JAXBElement<GetManagerEntitiesBySportResponse> createGetManagerEntitiesBySportResponse(GetManagerEntitiesBySportResponse value) {
        return new JAXBElement<GetManagerEntitiesBySportResponse>(_GetManagerEntitiesBySportResponse_QNAME, GetManagerEntitiesBySportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddReservationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "addReservationsResponse")
    public JAXBElement<AddReservationsResponse> createAddReservationsResponse(AddReservationsResponse value) {
        return new JAXBElement<AddReservationsResponse>(_AddReservationsResponse_QNAME, AddReservationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateManagerEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "updateManagerEntity")
    public JAXBElement<UpdateManagerEntity> createUpdateManagerEntity(UpdateManagerEntity value) {
        return new JAXBElement<UpdateManagerEntity>(_UpdateManagerEntity_QNAME, UpdateManagerEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteManagerEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "deleteManagerEntity")
    public JAXBElement<DeleteManagerEntity> createDeleteManagerEntity(DeleteManagerEntity value) {
        return new JAXBElement<DeleteManagerEntity>(_DeleteManagerEntity_QNAME, DeleteManagerEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEventByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "getEventByIdResponse")
    public JAXBElement<GetEventByIdResponse> createGetEventByIdResponse(GetEventByIdResponse value) {
        return new JAXBElement<GetEventByIdResponse>(_GetEventByIdResponse_QNAME, GetEventByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JoinEventResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "joinEventResponse")
    public JAXBElement<JoinEventResponse> createJoinEventResponse(JoinEventResponse value) {
        return new JAXBElement<JoinEventResponse>(_JoinEventResponse_QNAME, JoinEventResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "registerUser")
    public JAXBElement<RegisterUser> createRegisterUser(RegisterUser value) {
        return new JAXBElement<RegisterUser>(_RegisterUser_QNAME, RegisterUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateManagerEntityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "updateManagerEntityResponse")
    public JAXBElement<UpdateManagerEntityResponse> createUpdateManagerEntityResponse(UpdateManagerEntityResponse value) {
        return new JAXBElement<UpdateManagerEntityResponse>(_UpdateManagerEntityResponse_QNAME, UpdateManagerEntityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "getUserDetailsResponse")
    public JAXBElement<GetUserDetailsResponse> createGetUserDetailsResponse(GetUserDetailsResponse value) {
        return new JAXBElement<GetUserDetailsResponse>(_GetUserDetailsResponse_QNAME, GetUserDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddReservations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "addReservations")
    public JAXBElement<AddReservations> createAddReservations(AddReservations value) {
        return new JAXBElement<AddReservations>(_AddReservations_QNAME, AddReservations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteFieldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "deleteFieldResponse")
    public JAXBElement<DeleteFieldResponse> createDeleteFieldResponse(DeleteFieldResponse value) {
        return new JAXBElement<DeleteFieldResponse>(_DeleteFieldResponse_QNAME, DeleteFieldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservationsByFieldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "getReservationsByFieldResponse")
    public JAXBElement<GetReservationsByFieldResponse> createGetReservationsByFieldResponse(GetReservationsByFieldResponse value) {
        return new JAXBElement<GetReservationsByFieldResponse>(_GetReservationsByFieldResponse_QNAME, GetReservationsByFieldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddFieldSportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "addFieldSportResponse")
    public JAXBElement<AddFieldSportResponse> createAddFieldSportResponse(AddFieldSportResponse value) {
        return new JAXBElement<AddFieldSportResponse>(_AddFieldSportResponse_QNAME, AddFieldSportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEventsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "getEventsResponse")
    public JAXBElement<GetEventsResponse> createGetEventsResponse(GetEventsResponse value) {
        return new JAXBElement<GetEventsResponse>(_GetEventsResponse_QNAME, GetEventsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteFieldSport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "deleteFieldSport")
    public JAXBElement<DeleteFieldSport> createDeleteFieldSport(DeleteFieldSport value) {
        return new JAXBElement<DeleteFieldSport>(_DeleteFieldSport_QNAME, DeleteFieldSport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFieldByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "getFieldByIdResponse")
    public JAXBElement<GetFieldByIdResponse> createGetFieldByIdResponse(GetFieldByIdResponse value) {
        return new JAXBElement<GetFieldByIdResponse>(_GetFieldByIdResponse_QNAME, GetFieldByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFieldsByManagerEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "getFieldsByManagerEntity")
    public JAXBElement<GetFieldsByManagerEntity> createGetFieldsByManagerEntity(GetFieldsByManagerEntity value) {
        return new JAXBElement<GetFieldsByManagerEntity>(_GetFieldsByManagerEntity_QNAME, GetFieldsByManagerEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetManagerEntitiesByEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "getManagerEntitiesByEvent")
    public JAXBElement<GetManagerEntitiesByEvent> createGetManagerEntitiesByEvent(GetManagerEntitiesByEvent value) {
        return new JAXBElement<GetManagerEntitiesByEvent>(_GetManagerEntitiesByEvent_QNAME, GetManagerEntitiesByEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSportsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "getSportsResponse")
    public JAXBElement<GetSportsResponse> createGetSportsResponse(GetSportsResponse value) {
        return new JAXBElement<GetSportsResponse>(_GetSportsResponse_QNAME, GetSportsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateManagerEntityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "createManagerEntityResponse")
    public JAXBElement<CreateManagerEntityResponse> createCreateManagerEntityResponse(CreateManagerEntityResponse value) {
        return new JAXBElement<CreateManagerEntityResponse>(_CreateManagerEntityResponse_QNAME, CreateManagerEntityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "deleteField")
    public JAXBElement<DeleteField> createDeleteField(DeleteField value) {
        return new JAXBElement<DeleteField>(_DeleteField_QNAME, DeleteField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReportTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "getReportTypesResponse")
    public JAXBElement<GetReportTypesResponse> createGetReportTypesResponse(GetReportTypesResponse value) {
        return new JAXBElement<GetReportTypesResponse>(_GetReportTypesResponse_QNAME, GetReportTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEventsHistoryByUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "getEventsHistoryByUser")
    public JAXBElement<GetEventsHistoryByUser> createGetEventsHistoryByUser(GetEventsHistoryByUser value) {
        return new JAXBElement<GetEventsHistoryByUser>(_GetEventsHistoryByUser_QNAME, GetEventsHistoryByUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "getUserDetails")
    public JAXBElement<GetUserDetails> createGetUserDetails(GetUserDetails value) {
        return new JAXBElement<GetUserDetails>(_GetUserDetails_QNAME, GetUserDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "reportUser")
    public JAXBElement<ReportUser> createReportUser(ReportUser value) {
        return new JAXBElement<ReportUser>(_ReportUser_QNAME, ReportUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "createSportResponse")
    public JAXBElement<CreateSportResponse> createCreateSportResponse(CreateSportResponse value) {
        return new JAXBElement<CreateSportResponse>(_CreateSportResponse_QNAME, CreateSportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservationsByField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "getReservationsByField")
    public JAXBElement<GetReservationsByField> createGetReservationsByField(GetReservationsByField value) {
        return new JAXBElement<GetReservationsByField>(_GetReservationsByField_QNAME, GetReservationsByField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "addReservationResponse")
    public JAXBElement<AddReservationResponse> createAddReservationResponse(AddReservationResponse value) {
        return new JAXBElement<AddReservationResponse>(_AddReservationResponse_QNAME, AddReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSports }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "getSports")
    public JAXBElement<GetSports> createGetSports(GetSports value) {
        return new JAXBElement<GetSports>(_GetSports_QNAME, GetSports.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteReservations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "deleteReservations")
    public JAXBElement<DeleteReservations> createDeleteReservations(DeleteReservations value) {
        return new JAXBElement<DeleteReservations>(_DeleteReservations_QNAME, DeleteReservations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeaveEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "leaveEvent")
    public JAXBElement<LeaveEvent> createLeaveEvent(LeaveEvent value) {
        return new JAXBElement<LeaveEvent>(_LeaveEvent_QNAME, LeaveEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "deleteReservationResponse")
    public JAXBElement<DeleteReservationResponse> createDeleteReservationResponse(DeleteReservationResponse value) {
        return new JAXBElement<DeleteReservationResponse>(_DeleteReservationResponse_QNAME, DeleteReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddFieldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "addFieldResponse")
    public JAXBElement<AddFieldResponse> createAddFieldResponse(AddFieldResponse value) {
        return new JAXBElement<AddFieldResponse>(_AddFieldResponse_QNAME, AddFieldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "updateUser")
    public JAXBElement<UpdateUser> createUpdateUser(UpdateUser value) {
        return new JAXBElement<UpdateUser>(_UpdateUser_QNAME, UpdateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateReportTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "createReportTypeResponse")
    public JAXBElement<CreateReportTypeResponse> createCreateReportTypeResponse(CreateReportTypeResponse value) {
        return new JAXBElement<CreateReportTypeResponse>(_CreateReportTypeResponse_QNAME, CreateReportTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "createEvent")
    public JAXBElement<CreateEvent> createCreateEvent(CreateEvent value) {
        return new JAXBElement<CreateEvent>(_CreateEvent_QNAME, CreateEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEvents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "getEvents")
    public JAXBElement<GetEvents> createGetEvents(GetEvents value) {
        return new JAXBElement<GetEvents>(_GetEvents_QNAME, GetEvents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReportTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "getReportTypes")
    public JAXBElement<GetReportTypes> createGetReportTypes(GetReportTypes value) {
        return new JAXBElement<GetReportTypes>(_GetReportTypes_QNAME, GetReportTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEventResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "createEventResponse")
    public JAXBElement<CreateEventResponse> createCreateEventResponse(CreateEventResponse value) {
        return new JAXBElement<CreateEventResponse>(_CreateEventResponse_QNAME, CreateEventResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersByEventResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "getUsersByEventResponse")
    public JAXBElement<GetUsersByEventResponse> createGetUsersByEventResponse(GetUsersByEventResponse value) {
        return new JAXBElement<GetUsersByEventResponse>(_GetUsersByEventResponse_QNAME, GetUsersByEventResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEventById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "getEventById")
    public JAXBElement<GetEventById> createGetEventById(GetEventById value) {
        return new JAXBElement<GetEventById>(_GetEventById_QNAME, GetEventById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEventsByUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "getEventsByUserResponse")
    public JAXBElement<GetEventsByUserResponse> createGetEventsByUserResponse(GetEventsByUserResponse value) {
        return new JAXBElement<GetEventsByUserResponse>(_GetEventsByUserResponse_QNAME, GetEventsByUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateFieldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "updateFieldResponse")
    public JAXBElement<UpdateFieldResponse> createUpdateFieldResponse(UpdateFieldResponse value) {
        return new JAXBElement<UpdateFieldResponse>(_UpdateFieldResponse_QNAME, UpdateFieldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateFieldSportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "updateFieldSportResponse")
    public JAXBElement<UpdateFieldSportResponse> createUpdateFieldSportResponse(UpdateFieldSportResponse value) {
        return new JAXBElement<UpdateFieldSportResponse>(_UpdateFieldSportResponse_QNAME, UpdateFieldSportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersByEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "getUsersByEvent")
    public JAXBElement<GetUsersByEvent> createGetUsersByEvent(GetUsersByEvent value) {
        return new JAXBElement<GetUsersByEvent>(_GetUsersByEvent_QNAME, GetUsersByEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSportById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "getSportById")
    public JAXBElement<GetSportById> createGetSportById(GetSportById value) {
        return new JAXBElement<GetSportById>(_GetSportById_QNAME, GetSportById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFieldsByManagerEntityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ssn/", name = "getFieldsByManagerEntityResponse")
    public JAXBElement<GetFieldsByManagerEntityResponse> createGetFieldsByManagerEntityResponse(GetFieldsByManagerEntityResponse value) {
        return new JAXBElement<GetFieldsByManagerEntityResponse>(_GetFieldsByManagerEntityResponse_QNAME, GetFieldsByManagerEntityResponse.class, null, value);
    }

}
