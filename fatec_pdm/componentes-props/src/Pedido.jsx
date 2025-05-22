const Pedido = ({icone, titulo, descricao}) => {
    return (
            <div className="d-flex">
                <div className="d-flex align-items-center">
                    <i className={`fa-solid fa-${icone} fa-2x fa-shake`} />
                </div>
                <div className="border flex-grow-1 ms-3 py-2">
                    <h4 className="text-center">{titulo}</h4>
                    <p className="text-center">{descricao}</p>
                </div>
            </div>
    )
}

export default Pedido