//Component to Check Aadhar/PAN Card Eligibility

function CheckEligibility() {
    const [aadhar, setAadhar] = useState(false);
    const [pan, setPan] = useState(false);
  
    return (
      <div>
        <h2>Government Offer Eligibility</h2>
        <label>
          <input type="checkbox" onChange={() => setAadhar(!aadhar)} />
          I have Aadhar Card
        </label>
        <br />
        <label>
          <input type="checkbox" onChange={() => setPan(!pan)} />
          I have PAN Card
        </label>
        <br />
        {aadhar || pan ? (
          <h3>You are eligible for the government offer.</h3>
        ) : (
          <h3>You need either Aadhar or PAN card to be eligible.</h3>
        )}
      </div>
    );
  }