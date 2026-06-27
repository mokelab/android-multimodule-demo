package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data521RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data522RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data523RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data524RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data525RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data526RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data527RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data528RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data529RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data530RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen053ViewModel @Inject constructor(
    private val repo1: Data521RepositoryImpl,
    private val repo2: Data522RepositoryImpl,
    private val repo3: Data523RepositoryImpl,
    private val repo4: Data524RepositoryImpl,
    private val repo5: Data525RepositoryImpl,
    private val repo6: Data526RepositoryImpl,
    private val repo7: Data527RepositoryImpl,
    private val repo8: Data528RepositoryImpl,
    private val repo9: Data529RepositoryImpl,
    private val repo10: Data530RepositoryImpl,

): ViewModel() {
}
