const Feedback = ({ textoOK, funcaoOK, textoNOK, funcaoNOK }) => {
    return (
        <div className="d-flex justify-content-evenly mt-3">
            <button className="btn btn-primary" onClick={funcaoOK}>
                {textoOK}
            </button>
            <button className="btn btn-secundary" onClick={funcaoNOK}>
                {textoNOK}
            </button>
        </div>

    )
}

export default Feedback